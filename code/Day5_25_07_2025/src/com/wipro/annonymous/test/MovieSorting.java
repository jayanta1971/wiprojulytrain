package com.wipro.annonymous.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wipro.annonymous.Movie;

public class MovieSorting {

	public static void main(String[] args) {

	    Movie m1= new Movie("Titanic","English","Romantic",8);
		Movie m2= new Movie("Jurasic Park","English","Adventure",7.5);
		Movie m3= new Movie("Sholay","Hindi","Action",8.5);
		Movie m4= new Movie("Drishyam","Malayalam","Thriller",8.1);	
		
		List<Movie> listMovie= new ArrayList<>();
		listMovie.add(m1);
		listMovie.add(m2);
		listMovie.add(m3);
		listMovie.add(m3);
		
		
		Comparator<Movie> sortByImDB =(o1,o2)->{			
			Double d1= Double.valueOf(o1.getImdbRaing());
			Double d2= Double.valueOf(o2.getImdbRaing());
			return  d1.compareTo(d2);			
		};

		Collections.sort(listMovie, sortByImDB);
		System.out.println(listMovie);
		
		Comparator<Movie> sortByGenre =(o1,o2)->{		
		 			
			return  o1.getGenre().compareTo(o2.getGenre());
		};
		Collections.sort(listMovie, sortByGenre);
		System.out.println(listMovie);
	}

}
