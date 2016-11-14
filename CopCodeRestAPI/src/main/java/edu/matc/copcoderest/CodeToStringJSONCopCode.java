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
 * Created by netherskub on 11/9/16.
 */
@Path("/ctosservice/json/copcode")
public class CodeToStringJSONCopCode {

    @Path("{param}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response convertCopCodeJsonToStringFromInput(@PathParam("param") String code) throws JSONException {
        String policeCode = code;
        String result = null;

        JSONObject jsonObjectCopCode = new JSONObject();

        CopCodeDao copCodeDao = new CopCodeDao();


        List<CopCode> copCodesList = copCodeDao.getAll();


        for (CopCode copCode : copCodesList) {
            jsonObjectCopCode.put(copCode.getCopCode(), copCode.getCodeString());
        }

        if (jsonObjectCopCode.has(policeCode)) {
            result = "{\"" + policeCode + "\", \"" + jsonObjectCopCode.get(policeCode) + "\"}";
        }

        return Response.status(200).entity(result).build();
    }
}