package com.tcs.hibernatedemov2.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tcs.hibernatedemov2.entity.Movie;
import com.tcs.hibernatedemov2.util.HibernateUtil;

public class MovieRepo {
	
	public static void save(Movie movie)
	{
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction t = session.beginTransaction();
		session.persist(movie);
		t.commit();
		
	}
	public static void update(Movie movie)
	{
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction t = session.beginTransaction();
		Movie m=session.find(Movie.class, movie.getId());
		m.setLanguage(movie.getLanguage());
		m.setMovieName(movie.getMovieName());
		m.setMovieRating(movie.getMovieRating());
		
		Movie m1= new Movie();
	 
		session.persist(m);
		
		
		session.evict(m);
		t.commit();
		
	}
	
	public static void deleteById(int id)
	{
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction t = session.beginTransaction();
		Movie m=session.find(Movie.class, id);		 
		session.delete(m);
		t.commit();
		
	}
	
	public static Movie findById(int id)
	{
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction t = session.beginTransaction();
		Movie m=session.find(Movie.class, id);	
		t.commit();
		return m;
		
	}
	
	 
	
	public static List<Movie> findAll()
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx= session.beginTransaction();
		String hql="From Movie";
		Query query=session.createQuery(hql,Movie.class);
		List<Movie> list=query.list();
		return list;
		
	}
	
	public static List<String> findAllMovieName()
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx= session.beginTransaction();
		String hql="SELECT movieName FROM Movie";
		Query query=session.createQuery(hql,String.class);
		List<String> list=query.list();
		return list;
		
	}
	
	public static List<Movie> findByMovieName(String movieName)
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx= session.beginTransaction();
		String hql="FROM Movie where movieName=:mname";
		
		Query query=session.createQuery(hql,Movie.class);
		query.setParameter("mname",movieName);
		List<Movie> list=query.list();
		return list;
	
	}

}
