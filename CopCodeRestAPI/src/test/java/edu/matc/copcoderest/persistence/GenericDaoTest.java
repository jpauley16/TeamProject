package edu.matc.copcoderest.persistence;

import edu.matc.copcoderest.entity.*;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by craigwilson on 11/8/16.
 */
public class GenericDaoTest {

    private Logger log = Logger.getLogger(this.getClass());
    CopCodeDao copCodeDao;
    MedFireCodesDao medFireCodesDao;
    PoliceScannerCodeDao policeScannerCodeDao;
    Scanner11Dao scanner11Dao;
    Scanner137Dao scanner137Dao;

    @Before
    public void setup() {
        copCodeDao = new CopCodeDao();
        medFireCodesDao = new MedFireCodesDao();
        policeScannerCodeDao = new PoliceScannerCodeDao();
        scanner11Dao = new Scanner11Dao();
        scanner137Dao = new Scanner137Dao();
    }

    @Test
    public void getAllCopCodes() throws Exception {

        List<CopCode> copCodeList;

        copCodeList = copCodeDao.getAll();
        assertEquals(96, copCodeList.size());
    }

    @Test
    public void getAllMedFireCodes() throws Exception {

        List<MedFireCodes> medFireCodeList;

        medFireCodeList = medFireCodesDao.getAll();
        assertEquals(6, medFireCodeList.size());
    }

    @Test
    public void getAllPoliceScannerCodes() throws Exception {

        List<PoliceScannerCode> policeScannerCodeList;

        policeScannerCodeList = policeScannerCodeDao.getAll();
        assertEquals(66, policeScannerCodeList.size());
    }

    @Test
    public void getAllScanner11Codes() throws Exception {

        List<Scanner11> scanner11CodeList;

        scanner11CodeList = scanner11Dao.getAll();
        assertEquals(36, scanner11CodeList.size());
    }

    @Test
    public void getAllScanner137Codes() throws Exception {

        List<Scanner137> scanner137CodeList;

        scanner137CodeList = scanner137Dao.getAll();
        assertEquals(11, scanner137CodeList.size());
    }
}
