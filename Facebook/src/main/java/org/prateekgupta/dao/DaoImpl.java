package org.prateekgupta.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.prateekgupta.entity.UserEntity;
import org.prateekgupta.utils.HibernateUtils;

public class DaoImpl implements Dao {
    @Override
    public String save(UserEntity entity) {
        Session session = null;
        SessionFactory factory;
        try {
            factory = HibernateUtils.getFactory();
            session = factory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return "Details of the user saved";
    }
}
