package com.wipro.movie.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.movie.entity.Movie;
import com.wipro.movie.service.*;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@GetMapping
	List<Movie> findAll()
	{
		return movieService.findAll();
	}
	@GetMapping("/{id}")
	Movie findById(@PathVariable int id)
	{
		return movieService.findById(id);
	}
	@DeleteMapping("/{id}")
	void deleteById(@PathVariable int id)
	{
		movieService.deleteById(id);
	}
	@PostMapping
	void save(@RequestBody Movie movie)
	{
		movieService.save(movie);
		
	}
	
	@PutMapping
	void update(@RequestBody Movie movie)
	{
		movieService.save(movie);
		
	}

}
