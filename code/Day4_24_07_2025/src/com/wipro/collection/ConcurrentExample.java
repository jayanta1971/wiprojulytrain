package com.wipro.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentExample {

	public static void main(String[] args) {
		Movie m1= new Movie("Titanic","English","Romantic",8);
		Movie m2= new Movie("Jurasic Park","English","Adventure",7.5);
		Movie m3= new Movie("Sholay","Hindi","Action",8.5);
		Movie m4= new Movie("Drishyam","Malayalam","Thriller",8.1);		
		List<Movie> movieList= new CopyOnWriteArrayList<>();
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);
		movieList.add(m4);
		
		for(Movie movie:movieList)
		{
			//movie.setMovieName(movie.getMovieName().toUpperCase());
			if(movie.getImdbRaing()<8)
			{
				movieList.remove(movie);
			}
			
		}
		System.out.println(movieList);

	}

}
