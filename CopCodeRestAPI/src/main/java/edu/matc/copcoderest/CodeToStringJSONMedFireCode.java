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
@Path("/ctosservice/json/medfirecode")
public class CodeToStringJSONMedFireCode {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response convertCopCodeJsonToStringFromInput()throws JSONException
    {
        String result = "{\"Results\":[";
        JSONObject jsonObjectAll = new JSONObject();

        MedFireCodesDao medFireCodesDao = new MedFireCodesDao();

        List<MedFireCodes> medFireCodesList = medFireCodesDao.getAll();


        for (MedFireCodes medFireCodes : medFireCodesList)
        {
            jsonObjectAll.put("Code: " + medFireCodes.getCopCode(), "Code Meaning: " + medFireCodes.getCodeString());
        }

        int spacesToIndentEachLevel = 4;
        result += jsonObjectAll.toString(spacesToIndentEachLevel) + "]}";

        return Response.status(200).entity(result).build();
    }

    @Path("{param}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response convertCopCodeJsonToStringFromInput(@PathParam("param") String code) throws JSONException {

        String policeCode = code;
        String result = "{\"Results\":[";

        JSONObject jsonObjectMedFire = new JSONObject();

        MedFireCodesDao medFireCodesDao = new MedFireCodesDao();

        List<MedFireCodes> medFireCodesList = medFireCodesDao.getAll();

        for (MedFireCodes medFireCodes : medFireCodesList) {
            jsonObjectMedFire.put(medFireCodes.getCopCode(), medFireCodes.getCodeString());
        }

        if (jsonObjectMedFire.has(policeCode)) {
            result += "{\n\t\"Code\": \"" + policeCode + "\", \n\t\"Code Meaning\": \"" + jsonObjectMedFire.get(policeCode) + "\"";
        }

        result += "\n\t}]\n}";

        return Response.status(200).entity(result).build();
    }
}
