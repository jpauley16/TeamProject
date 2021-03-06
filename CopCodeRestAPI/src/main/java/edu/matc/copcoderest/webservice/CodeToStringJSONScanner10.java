package edu.matc.copcoderest.webservice;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Craig Wilson and Jeff Pauley on 11/10/16.
 */
@Path("/ctosservice/json/scanner10code")
public class CodeToStringJSONScanner10 {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response convertCopCodeJsonToStringFromInput()throws JSONException
    {
        String result = "{\"Results\":[{";
        Map<String, String> copCodesMap = new HashMap<String, String>();
        JSONObject jsonObjectAll = new JSONObject();

        CopCodeDao copCodeDao = new CopCodeDao();

        List<CopCode> copCodesList = copCodeDao.getAll();


        for (CopCode copCode : copCodesList)
        {
            jsonObjectAll.put("Code", copCode.getCopCode());
            jsonObjectAll.put("Code Meaning", copCode.getCodeString());
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

        JSONObject jsonObjectCopCode = new JSONObject();

        CopCodeDao copCodeDao = new CopCodeDao();

        List<CopCode> copCodesList = copCodeDao.getAll();


        for (CopCode copCode : copCodesList) {
            jsonObjectCopCode.put(copCode.getCopCode(), copCode.getCodeString());
        }

        if (jsonObjectCopCode.has(policeCode)) {
            result += "{\n\t\"Code\": \"" + policeCode + "\", \n\t\"Code Meaning\": \"" + jsonObjectCopCode.get(policeCode) + "\"";
        }

        result += "\n\t}]\n}";

        return Response.status(200).entity(result).build();
    }
}