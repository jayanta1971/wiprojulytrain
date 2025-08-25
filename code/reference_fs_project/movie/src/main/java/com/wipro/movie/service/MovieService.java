package com.wipro.movie.service;

import java.util.List;

import com.wipro.movie.entity.Movie;

 

public interface MovieService {
	List<Movie> findAll();
	Movie findById(int id);
	void save(Movie user);
	void deleteById(int id);
}
