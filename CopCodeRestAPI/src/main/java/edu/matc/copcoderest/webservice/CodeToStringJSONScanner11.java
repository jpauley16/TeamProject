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
import java.util.List;
/**
 * Created by Craig Wilson and Jeff Pauley on 11/10/16.
 */
@Path("/ctosservice/json/scanner11code")
public class CodeToStringJSONScanner11 {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response convertCopCodeJsonToStringFromInput()throws JSONException
    {
        String result = "{\"Results\":[{";
        JSONObject jsonObjectAll = new JSONObject();

        Scanner11Dao scanner11Dao = new Scanner11Dao();

        List<Scanner11> scanner11List = scanner11Dao.getAll();


        for (Scanner11 scanner11 : scanner11List)
        {
            jsonObjectAll.put("Code", scanner11.getCopCode());
            jsonObjectAll.put("Code Meaning", scanner11.getCodeString());
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

        JSONObject jsonObjectScanner11 = new JSONObject();

        Scanner11Dao scanner11Dao = new Scanner11Dao();

        List<Scanner11> scanner11List = scanner11Dao.getAll();

        for (Scanner11 scanner11 : scanner11List) {
            jsonObjectScanner11.put(scanner11.getCopCode(), scanner11.getCodeString());
        }

        if (jsonObjectScanner11.has(policeCode)) {
            result += "{\n\t\"Code\": \"" + policeCode + "\", \n\t\"Code Meaning\": \"" + jsonObjectScanner11.get(policeCode) + "\"";
        }

        result += "\n\t}]\n}";

        return Response.status(200).entity(result).build();
    }
}
