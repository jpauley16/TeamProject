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
@Path("/ctosservice/json")
public class CodeToStringJSON {

    @Path("{param}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response convertCopCodeJsonToStringFromInput(@PathParam("param") String code) throws JSONException
    {
        String policeCode = code;
        String result = null;

        JSONObject jsonObjectCopCode = new JSONObject();
        JSONObject jsonObjectMedFire = new JSONObject();
        JSONObject jsonObjectPoliceScanner = new JSONObject();
        JSONObject jsonObjectScanner11 = new JSONObject();
        JSONObject jsonObjectScanner137 = new JSONObject();

        CopCodeDao copCodeDao = new CopCodeDao();
        MedFireCodesDao medFireCodesDao = new MedFireCodesDao();
        PoliceScannerCodeDao policeScannerCodeDao = new PoliceScannerCodeDao();
        Scanner11Dao scanner11Dao = new Scanner11Dao();
        Scanner137Dao scanner137Dao = new Scanner137Dao();

        List<CopCode> copCodesList = copCodeDao.getAll();
        List<MedFireCodes> medFireCodesList = medFireCodesDao.getAll();
        List<PoliceScannerCode> policeScannerCodeList = policeScannerCodeDao.getAll();
        List<Scanner11> scanner11List = scanner11Dao.getAll();
        List<Scanner137> scanner137List = scanner137Dao.getAll();

        for (CopCode copCode : copCodesList)
        {
            jsonObjectCopCode.put(copCode.getCopCode(), copCode.getCodeString());
        }

        for (MedFireCodes medFireCodes : medFireCodesList)
        {
            jsonObjectMedFire.put(medFireCodes.getCopCode(), medFireCodes.getCodeString());
        }

        for (PoliceScannerCode policeScannerCode : policeScannerCodeList)
        {
            jsonObjectPoliceScanner.put(policeScannerCode.getScannerCode(), policeScannerCode.getScannerString());
        }

        for (Scanner11 scanner11 : scanner11List)
        {
            jsonObjectScanner11.put(scanner11.getCopCode(), scanner11.getCodeString());
        }

        for (Scanner137 scanner137 : scanner137List)
        {
            jsonObjectScanner137.put(scanner137.getCopCode(), scanner137.getCodeString());
        }


        if (jsonObjectCopCode.has(policeCode))
        {
            result = "Cop Codes JSON to String:\n\n" + "{\"" + policeCode + "\", \"" + jsonObjectCopCode.get(policeCode) + "\"}";
        }

        if (jsonObjectMedFire.has(policeCode))
        {
            result = "Medical/Fire Codes JSON to String:\n\n" + "{\"" + policeCode + "\", \"" + jsonObjectMedFire.get(policeCode) + "\"}";
        }

        if (jsonObjectPoliceScanner.has(policeCode))
        {
            result = "PoliceScanner Codes JSON to String:\n\n" + "{\"" + policeCode + "\", \"" + jsonObjectPoliceScanner.get(policeCode) + "\"}";
        }

        if (jsonObjectScanner11.has(policeCode))
        {
            result = "Scanner11 Codes JSON to String:\n\n" + "{\"" + policeCode + "\", \"" + jsonObjectScanner11.get(policeCode) + "\"}";
        }

        if (jsonObjectScanner137.has(policeCode))
        {
            result = "Scanner137 Codes JSON to String:\n\n" + "{\"" + policeCode + "\", \"" + jsonObjectScanner137.get(policeCode) + "\"}";
        }

        return Response.status(200).entity(result).build();
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response convertCopCodeJsonToStringFromInput()throws JSONException
    {
        String result = null;

        JSONObject jsonObjectCopCode = new JSONObject();
        JSONObject jsonObjectMedFire = new JSONObject();
        JSONObject jsonObjectPoliceScanner = new JSONObject();
        JSONObject jsonObjectScanner11 = new JSONObject();
        JSONObject jsonObjectScanner137 = new JSONObject();

        CopCodeDao copCodeDao = new CopCodeDao();
        MedFireCodesDao medFireCodesDao = new MedFireCodesDao();
        PoliceScannerCodeDao policeScannerCodeDao = new PoliceScannerCodeDao();
        Scanner11Dao scanner11Dao = new Scanner11Dao();
        Scanner137Dao scanner137Dao = new Scanner137Dao();

        List<CopCode> copCodesList = copCodeDao.getAll();
        List<MedFireCodes> medFireCodesList = medFireCodesDao.getAll();
        List<PoliceScannerCode> policeScannerCodeList = policeScannerCodeDao.getAll();
        List<Scanner11> scanner11List = scanner11Dao.getAll();
        List<Scanner137> scanner137List = scanner137Dao.getAll();

        for (CopCode copCode : copCodesList)
        {
            jsonObjectCopCode.put(copCode.getCopCode(), copCode.getCodeString());
        }

        for (MedFireCodes medFireCodes : medFireCodesList)
        {
            jsonObjectMedFire.put(medFireCodes.getCopCode(), medFireCodes.getCodeString());
        }

        for (PoliceScannerCode policeScannerCode : policeScannerCodeList)
        {
            jsonObjectPoliceScanner.put(policeScannerCode.getScannerCode(), policeScannerCode.getScannerString());
        }

        for (Scanner11 scanner11 : scanner11List)
        {
            jsonObjectScanner11.put(scanner11.getCopCode(), scanner11.getCodeString());
        }

        for (Scanner137 scanner137 : scanner137List)
        {
            jsonObjectScanner137.put(scanner137.getCopCode(), scanner137.getCodeString());
        }

        result = "All Codes JSON to String:\n\n" + jsonObjectScanner137 + "\n\n" + jsonObjectScanner11 + "\n\n"
                    + jsonObjectPoliceScanner + "\n\n" + jsonObjectMedFire + "\n\n" + jsonObjectCopCode;

        return Response.status(200).entity(result).build();
    }
}
