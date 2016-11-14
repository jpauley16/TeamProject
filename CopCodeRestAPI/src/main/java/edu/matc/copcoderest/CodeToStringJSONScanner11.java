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
@Path("/ctosservice/json/scanner11")
public class CodeToStringJSONScanner11 {

    @Path("{param}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response convertCopCodeJsonToStringFromInput(@PathParam("param") String code) throws JSONException {
        String policeCode = code;
        String result = null;

        JSONObject jsonObjectScanner11 = new JSONObject();

        Scanner11Dao scanner11Dao = new Scanner11Dao();

        List<Scanner11> scanner11List = scanner11Dao.getAll();

        for (Scanner11 scanner11 : scanner11List) {
            jsonObjectScanner11.put(scanner11.getCopCode(), scanner11.getCodeString());
        }

        if (jsonObjectScanner11.has(policeCode)) {
            result = "{\"" + policeCode + "\", \"" + jsonObjectScanner11.get(policeCode) + "\"}";
        }

        return Response.status(200).entity(result).build();
    }
}
