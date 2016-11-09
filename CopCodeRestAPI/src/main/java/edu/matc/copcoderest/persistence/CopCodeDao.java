package edu.matc.copcoderest.persistence;

import edu.matc.copcoderest.entity.CopCode;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by craigwilson on 11/8/16.
 */
public class CopCodeDao extends GenericDao {

    public CopCodeDao() {

        super(CopCode.class);

    }

}
