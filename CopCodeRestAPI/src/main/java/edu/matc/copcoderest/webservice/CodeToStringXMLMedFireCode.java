package edu.matc.copcoderest.webservice;

import edu.matc.copcoderest.persistence.MedFireCodesDao;
import edu.matc.copcoderest.entity.MedFireCodes;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.*;

/**
 * Created by Craig Wilson and Jeff Pauley on 11/10/16.
 */
@Path("/ctosservice/xml/medfirecode")
public class CodeToStringXMLMedFireCode {

    @Path("{param}")
    @GET
    @Produces(MediaType.TEXT_XML)
    public Response convertCodeToString(@PathParam("param") String code) {

        String policeCode = code;
        String results = "";

        Map<String, String> copCodesMap = new TreeMap<String, String>();

        MedFireCodesDao medFireCodesDao = new MedFireCodesDao();

        List<MedFireCodes> copCodesList = medFireCodesDao.getAll();

        for (MedFireCodes copCode : copCodesList) {
            copCodesMap.put(copCode.getCopCode(), copCode.getCodeString());
        }

        for (Map.Entry<String, String> entry : copCodesMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (key.equals(policeCode)) {
                results += "<ctosservice><code>" + key + "</code><codeMeaning>" + value + "</codeMeaning></ctosservice>";

            }
        }

        return Response.status(200).entity(results).build();
    }


    @GET
    @Produces(MediaType.TEXT_XML)
    public Response convertCodeToStringAll() {

        String results = "<ctosservice>";

        Map<String, String> copCodesMap = new TreeMap<String, String>();

        MedFireCodesDao medFireCodesDao = new MedFireCodesDao();

        List<MedFireCodes> copCodesList = medFireCodesDao.getAll();

        for (MedFireCodes copCode : copCodesList) {
            copCodesMap.put(copCode.getCopCode(), copCode.getCodeString());
        }

        for (Map.Entry<String, String> entry : copCodesMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            results += "<code>" + key + "</code><codeMeaning>" + value + "</codeMeaning>";
        }

        results += "</ctosservice>";


        return Response.status(200).entity(results).build();
    }
}
