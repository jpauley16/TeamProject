package edu.matc.copcoderest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import edu.matc.copcoderest.entity.MedFireCodes;
import edu.matc.copcoderest.persistence.*;
import edu.matc.copcoderest.entity.CopCode;
import edu.matc.copcoderest.entity.PoliceScannerCode;
import edu.matc.copcoderest.entity.Scanner11;
import edu.matc.copcoderest.entity.Scanner137;

import java.util.*;

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

        Map<String, String> copCodesMap = new HashMap<String, String>();

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


        for (CopCode copCode : copCodesList) {
            copCodesMap.put(copCode.getCopCode(), copCode.getCodeString());
        }

        for (MedFireCodes medFireCodes : medFireCodesList) {
            copCodesMap.put(medFireCodes.getCopCode(), medFireCodes.getCodeString());
        }

        for (PoliceScannerCode policeScannerCode : policeScannerCodeList) {
            copCodesMap.put(policeScannerCode.getScannerCode(), policeScannerCode.getScannerString());
        }

        for (Scanner11 scanner11Code : scanner11List) {
            copCodesMap.put(scanner11Code.getCopCode(), scanner11Code.getCodeString());
        }

        for (Scanner137 scanner137Code : scanner137List) {
            copCodesMap.put(scanner137Code.getCopCode(), scanner137Code.getCodeString());
        }


        String results = "<ctosservice><code>" + policeCode + "</code><codeMeaning>" + copCodesMap.get(policeCode) + "</codeMeaning></ctosservice>";



        return Response.status(200).entity(results).build();
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    public Response convertCodeToStringAll() {

        String results = null;

        Map<String, String> copCodesMap = new HashMap<String, String>();

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


        for (CopCode copCode : copCodesList) {
            copCodesMap.put(copCode.getCopCode(), copCode.getCodeString());
        }

        for (MedFireCodes medFireCodes : medFireCodesList) {
            copCodesMap.put(medFireCodes.getCopCode(), medFireCodes.getCodeString());
        }

        for (PoliceScannerCode policeScannerCode : policeScannerCodeList) {
            copCodesMap.put(policeScannerCode.getScannerCode(), policeScannerCode.getScannerString());
        }

        for (Scanner11 scanner11Code : scanner11List) {
            copCodesMap.put(scanner11Code.getCopCode(), scanner11Code.getCodeString());
        }

        for (Scanner137 scanner137Code : scanner137List) {
            copCodesMap.put(scanner137Code.getCopCode(), scanner137Code.getCodeString());
        }


        for (Map.Entry<String, String> entry : copCodesMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            results += "<ctosservice><code>" + key + "</code><codeMeaning>" + value + "</codeMeaning></ctosservice>";
        }


        return Response.status(200).entity(results).build();
    }



}
