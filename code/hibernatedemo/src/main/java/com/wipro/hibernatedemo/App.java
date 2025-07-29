package com.wipro.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wipro.hibernatedemo.entity.Movie;
import com.wipro.hibernatedemo.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Session session= HibernateUtil.getSessionFactory().getCurrentSession();
    	Transaction transaction=session.beginTransaction();
    	Movie m= new Movie("Catch me if you can","English",8.0);   
    	session.persist(m);
    	transaction.commit();   	
    	
    	
    }
}
