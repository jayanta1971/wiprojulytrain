package com.wipro.firstboot.repo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class MovieRepo {
	
	public List<String> getMovieList()
	{
		
		return Arrays.asList("Titanic","Catch Me if you Can","Gravity","Sholay");
	}

}
