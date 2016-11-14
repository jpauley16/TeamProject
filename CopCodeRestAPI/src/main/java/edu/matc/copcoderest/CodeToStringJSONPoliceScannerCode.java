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

    @Path("{param}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response convertCopCodeJsonToStringFromInput(@PathParam("param") String code) throws JSONException {
        String policeCode = code;
        String result = null;


        JSONObject jsonObjectPoliceScanner = new JSONObject();

        PoliceScannerCodeDao policeScannerCodeDao = new PoliceScannerCodeDao();

        List<PoliceScannerCode> policeScannerCodeList = policeScannerCodeDao.getAll();

        for (PoliceScannerCode policeScannerCode : policeScannerCodeList) {
            jsonObjectPoliceScanner.put(policeScannerCode.getScannerCode(), policeScannerCode.getScannerString());
        }

        if (jsonObjectPoliceScanner.has(policeCode)) {
            result = "{\"" + policeCode + "\", \"" + jsonObjectPoliceScanner.get(policeCode) + "\"}";
        }

        return Response.status(200).entity(result).build();
    }
}
