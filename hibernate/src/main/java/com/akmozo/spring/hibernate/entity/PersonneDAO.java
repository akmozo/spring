package com.akmozo.spring.hibernate.entity;

import org.hibernate.Session;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonneDAO {

    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;
    
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    public Client addClient(Client client) {
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();      
            session.save(client);
            transaction.commit();
        } catch(Exception e){
            return null;            
        } finally {
            session.close();
            //sessionFactory.close();
        }
        return client;
    }    

    public Personne add(Personne personne) {
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();      
            session.save(personne);
            transaction.commit();
        } catch(Exception e){
            return null;            
        } finally {
            session.close();
            //sessionFactory.close();
        }
        return personne;
    }


    public Personne delete(Personne personne) {       
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();      
            session.delete(personne);
            transaction.commit();
        } catch(Exception e){
            return null;
        } finally {
            session.close();
            //sessionFactory.close();
        }
        return personne;
    }

    public List<Personne> search(String nom) {       
        List<Personne> results = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Query query = session.createQuery("From Personne p Where p.nom = :nom").setParameter("nom", nom);
            results = query.list();
            transaction.rollback();
        } catch(Exception e){
            return null;
        } finally {
            session.close();
            //sessionFactory.close();
        }        
        return results;
    }
    
}
