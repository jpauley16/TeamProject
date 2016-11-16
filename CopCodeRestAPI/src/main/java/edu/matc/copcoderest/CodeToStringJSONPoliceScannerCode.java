package edu.matc.copcoderest;

import edu.matc.copcoderest.entity.*;
import edu.matc.copcoderest.persistence.*;

import org.json.JSONException;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
/**
 * Created by netherskub on 11/14/16.
 */
@Path("/ctosservice/json/policescannercode")
public class CodeToStringJSONPoliceScannerCode {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response convertCopCodeJsonToStringFromInput()throws JSONException
    {
        String result = "{\"Results\":[{";
        JSONObject jsonObjectAll = new JSONObject();

        PoliceScannerCodeDao policeScannerCodeDao = new PoliceScannerCodeDao();

        List<PoliceScannerCode> policeScannerCodeList = policeScannerCodeDao.getAll();


        for (PoliceScannerCode policeScannerCode : policeScannerCodeList)
        {
            jsonObjectAll.put("Code", policeScannerCode.getScannerCode());
            jsonObjectAll.put("Code Meaning", policeScannerCode.getScannerString());
            result += "\n\t\"Code\": \"" + jsonObjectAll.getString("Code") + "\", \n\t\"Code Meaning\": \""
                    + jsonObjectAll.getString("Code Meaning") + "\",";
        }

        if (result.endsWith(",")) {
            result = result.substring(0, result.length() - 1);
        }

        result += "\n\t}]\n}";


        return Response.status(200).entity(result).build();
    }

    @Path("{param}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response convertCopCodeJsonToStringFromInput(@PathParam("param") String code) throws JSONException {

        String policeCode = code;
        String result = "{\"Results\":[";

        JSONObject jsonObjectPoliceScanner = new JSONObject();

        PoliceScannerCodeDao policeScannerCodeDao = new PoliceScannerCodeDao();

        List<PoliceScannerCode> policeScannerCodeList = policeScannerCodeDao.getAll();

        for (PoliceScannerCode policeScannerCode : policeScannerCodeList) {
            jsonObjectPoliceScanner.put(policeScannerCode.getScannerCode(), policeScannerCode.getScannerString());
        }

        if (jsonObjectPoliceScanner.has(policeCode)) {
            result += "{\n\t\"Code\": \"" + policeCode + "\", \n\t\"Code Meaning\": \"" + jsonObjectPoliceScanner.get(policeCode) + "\"";
        }

        result += "\n\t}]\n}";

        return Response.status(200).entity(result).build();
    }
}
