package com.wipro.collection.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.wipro.collection.Movie;

public class ArrayListMovie {

	public static void main(String[] args) {
		 Movie m1= new Movie("Catch me if you can","English");
		 Movie m2= new Movie("Dear Zindegi","Hindi");
		 Movie m3= new Movie("RRR","Telegu");
		 
		 List<Movie> movieList= new ArrayList<>();
		 movieList.add(m2);
		 movieList.add(m3);
		 movieList.add(m1);
		 System.out.println(movieList);
	}

}
