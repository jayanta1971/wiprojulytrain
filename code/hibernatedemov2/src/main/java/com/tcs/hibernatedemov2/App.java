package com.tcs.hibernatedemov2;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tcs.hibernatedemov2.entity.*;
import com.tcs.hibernatedemov2.repo.MovieRepo;
import com.tcs.hibernatedemov2.util.*;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		//insert
//		Movie movie = new Movie("MI8", "English", 7);
//		MovieRepo.save(movie);
		
		//update
//		Movie movie = new Movie(1,"MI7", "Hindi", 7);
//		MovieRepo.update(movie);
		
		//delete
		//MovieRepo.deleteById(1);
		
		//find
//		Movie m= MovieRepo.findById(2);
//		System.out.println(m);
		
//		List<Movie> list=MovieRepo.findAll();
//		System.out.println(list);
		
		//List<String> list=MovieRepo.findAllMovieName();
//		List<Movie> list=MovieRepo.findByMovieName("MI8");
//		System.out.println(list);
		
		Movie m= new Movie();
		

	}
}
