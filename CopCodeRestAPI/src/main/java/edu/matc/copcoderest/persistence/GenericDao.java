package edu.matc.copcoderest.persistence;


import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Craig Wilson and Jeff Pauley on 11/10/16.
 */
public class GenericDao<T> {

    private Class<T> type;
    private Logger log = Logger.getLogger(this.getClass());

    public GenericDao(Class<T> type) {

        this.type = type;

    }

    public int create(T object) {

        Transaction transaction = null;
        Integer id = null;
        Session session = getSession();

        try {
            transaction = session.beginTransaction();
            id = (Integer) session.save(object);
            transaction.commit();
            log.debug("Created " + object.getClass().getName() + " with id " +
                    "of: " + id);

        } catch (HibernateException e) {
            if (transaction!=null) transaction.rollback();
            log.error(e);
        } finally {
            session.close();
        }

        return id;

    }

    public T get(int id) {

        return (T) getSession().get(type, id);

    }

    public ArrayList<T> getAll() {

        return (ArrayList<T>) getSession().createCriteria(type).list();

    }

    public void update(T object) {

        Session session = getSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(object);
            transaction.commit();
            log.debug("Updated " + object.getClass().getName() + ": " + object);
        } catch (HibernateException e) {
            if (transaction!=null) transaction.rollback();
            log.error(e);
        } finally {
            session.close();
        }

    }

    public void delete(T object) {

        Session session = getSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.delete(object);
            transaction.commit();
            log.debug("Deleted " + object.getClass().getName() + ": " + object);
        } catch (HibernateException e) {
            if (transaction!=null) transaction.rollback();
            log.error(e);
        } finally {
            session.close();
        }

    }

    protected Session getSession() {

        return SessionFactoryProvider.getSessionFactory().openSession();

    }

}
