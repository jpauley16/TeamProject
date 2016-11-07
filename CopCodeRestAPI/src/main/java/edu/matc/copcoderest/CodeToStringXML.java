package edu.matc.copcoderest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by craigwilson on 11/7/16.
 */
@Path("/ctosservice/xml")
public class CodeToStringXML {
    @Path("{param}")
    @GET
    @Produces(MediaType.TEXT_XML)
    public Response convertCodeToString(@PathParam("param") String code) {

        String policeCode = code;
        String codeMeaning;
        String results = "<ctosservice><code>" + policeCode + "</code><codeMeaning>Unknown</codeMeaning></ctosservice>";

        if (policeCode.equals("10-0")) {
            codeMeaning = "Caution";
            results =  "<ctosservice><code>" + policeCode + "</code><codeMeaning>" + codeMeaning + "</codeMeaning></ctosservice>";
        }

        if (policeCode.equals("10-1")) {
            codeMeaning = "Reception poor";
            results =  "<ctosservice><code>" + policeCode + "</code><codeMeaning>" + codeMeaning + "</codeMeaning></ctosservice>";
        }

        if (policeCode.equals("10-2")) {
            codeMeaning = "Reception good";
            results =  "<ctosservice><code>" + policeCode + "</code><codeMeaning>" + codeMeaning + "</codeMeaning></ctosservice>";
        }

        if (policeCode.equals("10-3")) {
            codeMeaning = "Stop transmitting";
            results =  "<ctosservice><code>" + policeCode + "</code><codeMeaning>" + codeMeaning + "</codeMeaning></ctosservice>";
        }

        if (policeCode.equals("10-4")) {
            codeMeaning = "Message received, understood";
            results =  "<ctosservice><code>" + policeCode + "</code><codeMeaning>" + codeMeaning + "</codeMeaning></ctosservice>";
        }

        if (policeCode.equals("10-5")) {
            codeMeaning = "Relay message";
            results =  "<ctosservice><code>" + policeCode + "</code><codeMeaning>" + codeMeaning + "</codeMeaning></ctosservice>";
        }

        if (policeCode.equals("10-6")) {
            codeMeaning = "Change channel";
            results =  "<ctosservice><code>" + policeCode + "</code><codeMeaning>" + codeMeaning + "</codeMeaning></ctosservice>";
        }

        if (policeCode.equals("10-7")) {
            codeMeaning = "Out of service";
            results =  "<ctosservice><code>" + policeCode + "</code><codeMeaning>" + codeMeaning + "</codeMeaning></ctosservice>";
        }

        if (policeCode.equals("10-7A")) {
            codeMeaning = "Out of service, home";
            results =  "<ctosservice><code>" + policeCode + "</code><codeMeaning>" + codeMeaning + "</codeMeaning></ctosservice>";
        }

        if (policeCode.equals("10-7B")) {
            codeMeaning = "Out of service, personal";
            results =  "<ctosservice><code>" + policeCode + "</code><codeMeaning>" + codeMeaning + "</codeMeaning></ctosservice>";
        }

        return Response.status(200).entity(results).build();
    }



}
