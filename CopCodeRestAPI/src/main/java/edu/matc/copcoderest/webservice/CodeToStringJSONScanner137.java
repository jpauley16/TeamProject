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
@Path("/ctosservice/json/scanner137code")
public class CodeToStringJSONScanner137 {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response convertCopCodeJsonToStringFromInput()
            throws JSONException
    {
        String result = "{\"Results\":[";
        JSONObject jsonObjectAll = new JSONObject();

        Scanner137Dao scanner137Dao = new Scanner137Dao();

        List<Scanner137> scanner137List = scanner137Dao.getAll();

        for (Scanner137 scanner137 : scanner137List)
        {
            jsonObjectAll.put("Code", scanner137.getCopCode());
            jsonObjectAll.put("Code Meaning", scanner137.getCodeString());

        }

        int spacesToIndentEachLevel = 4;
        result += jsonObjectAll.toString(spacesToIndentEachLevel) + "]}";

        return Response.status(200).entity(result).build();
    }

    @Path("{param}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response convertCopCodeJsonToStringFromInput(@PathParam("param") String code)
            throws JSONException
    {

        String policeCode = code;
        String result = "{\"Results\":[";

        JSONObject jsonObjectScanner137 = new JSONObject();

        Scanner137Dao scanner137Dao = new Scanner137Dao();

        List<Scanner137> scanner137List = scanner137Dao.getAll();

        for (Scanner137 scanner137 : scanner137List) {
            jsonObjectScanner137.put(scanner137.getCopCode(), scanner137.getCodeString());

        }

        if (jsonObjectScanner137.has(policeCode)) {
            result += "{\n\t\"Code\": \"" + policeCode + "\", \n\t\"Code Meaning\": \""
                    + jsonObjectScanner137.get(policeCode) + "\"";
        }

        result += "\n\t}]\n}";

        return Response.status(200).entity(result).build();
    }
}
