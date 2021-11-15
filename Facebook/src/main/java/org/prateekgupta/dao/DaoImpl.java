package org.prateekgupta.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.prateekgupta.entity.LoginEntity;
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
        }
        finally {
            if (session != null) {
                session.close();
            }
        }
        return "Details of the user saved";
    }

    @Override
    public LoginEntity getByEmail(String email) {
        Session session = null;
        SessionFactory factory;
        LoginEntity result;
        try {
            factory = HibernateUtils.getFactory();
            session = factory.openSession();
            Query query=session.createNamedQuery("getByEmail");
            query.setParameter("providedEmail",email);
            result= (LoginEntity) query.uniqueResult();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return result;
    }

    @Override
    public UserEntity getById(int id) {
        Session session = null;
        SessionFactory factory;
        UserEntity result;
        try {
            factory = HibernateUtils.getFactory();
            session = factory.openSession();
            Query<UserEntity> query=session.createNamedQuery("getById");
            query.setParameter("providedId",id);
            result =query.uniqueResult();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return result;
    }

    @Override
    public String updatePassword(String password,int id) {
        Session session = null;
        SessionFactory factory;
        UserEntity result;
        try {
            factory = HibernateUtils.getFactory();
            session = factory.openSession();
            Transaction transaction= session.beginTransaction();
            Query query=session.createNamedQuery("updatePassword");
            query.setParameter("providedPassword",password);
            query.setParameter("providedId",id);
            query.executeUpdate();
            transaction.commit();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return "Password updated";
    }
}
