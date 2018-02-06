package com.app;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DBOps {

    private EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("Hello");
    private EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
    private EntityTransaction transaction;
    private Session session;

    public User createUser(User user) throws Exception, java.lang.Exception {
        transaction = manager.getTransaction();
        transaction.begin();
        manager.persist(user);
        transaction.commit();

        return user;
    }

    public String findUser(User user) {
        session = (Session) manager.getDelegate();
        Query query = session.createQuery("select username from User where username = :username and password = :password");
        query.setParameter("username", user.getUsername());
        query.setParameter("password", user.getPassword());
        String resultUsername = (String) query.uniqueResult();

        Transaction tx = session.beginTransaction();

        if(!tx.wasCommitted()){
            tx.commit();
        }
        session.close();

        return resultUsername;
    }
}
