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
@Path("/ctosservice/json/scanner137")
public class CodeToStringJSONScanner137 {

    @Path("{param}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response convertCopCodeJsonToStringFromInput(@PathParam("param") String code) throws JSONException {
        String policeCode = code;
        String result = null;

        JSONObject jsonObjectScanner137 = new JSONObject();

        Scanner137Dao scanner137Dao = new Scanner137Dao();

        List<Scanner137> scanner137List = scanner137Dao.getAll();

        for (Scanner137 scanner137 : scanner137List) {
            jsonObjectScanner137.put(scanner137.getCopCode(), scanner137.getCodeString());
        }

        if (jsonObjectScanner137.has(policeCode)) {
            result = "{\"" + policeCode + "\", \"" + jsonObjectScanner137.get(policeCode) + "\"}";
        }

        return Response.status(200).entity(result).build();
    }
}
