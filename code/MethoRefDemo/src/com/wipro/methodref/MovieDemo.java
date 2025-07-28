package com.wipro.methodref;

import java.util.ArrayList;
import java.util.List;

public class MovieDemo {

	public static void main(String[] args) {
	 
		Movie m1= new Movie("Titanic","English");
		Movie m2= new Movie("RRR","Telugu");
		Movie m3= new Movie("Catch Me if you can","Telugu");
		List<Movie> listMovie =new ArrayList<>();
		listMovie.add(m1);
		listMovie.add(m2);
		listMovie.add(m3);
		
 		MovieComparator comp= new MovieComparator();
//		listMovie.sort(comp);
//		
//		System.out.println(listMovie);
		listMovie.stream()
		.sorted(comp::compare)
		.forEach(System.out::println);
		
	}

}
