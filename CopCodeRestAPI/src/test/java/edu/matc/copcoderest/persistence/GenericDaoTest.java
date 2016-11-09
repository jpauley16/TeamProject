package edu.matc.copcoderest.persistence;

import edu.matc.copcoderest.entity.CopCode;
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

    @Before
    public void setup() {
        copCodeDao = new CopCodeDao();
    }

    @Test
    public void getAll() throws Exception {

        List<CopCode> copCodeList;

        copCodeList = copCodeDao.getAll();
        assertEquals(96, copCodeList.size());

    }
}
