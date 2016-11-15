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

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response convertCopCodeJsonToStringFromInput()throws JSONException
    {
        String result = "{\"Results\":[";

        JSONObject jsonObjectAll = new JSONObject();

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
            jsonObjectAll.put(copCode.getCopCode(), copCode.getCodeString());
        }

        for (MedFireCodes medFireCodes : medFireCodesList)
        {
            jsonObjectAll.put(medFireCodes.getCopCode(), medFireCodes.getCodeString());
        }

        for (PoliceScannerCode policeScannerCode : policeScannerCodeList)
        {
            jsonObjectAll.put(policeScannerCode.getScannerCode(), policeScannerCode.getScannerString());
        }

        for (Scanner11 scanner11 : scanner11List)
        {
            jsonObjectAll.put(scanner11.getCopCode(), scanner11.getCodeString());
        }

        for (Scanner137 scanner137 : scanner137List)
        {
            jsonObjectAll.put(scanner137.getCopCode(), scanner137.getCodeString());
        }

        int spacesToIndentEachLevel = 2;
        result += jsonObjectAll.toString(spacesToIndentEachLevel);



        return Response.status(200).entity(result).build();
    }
}
