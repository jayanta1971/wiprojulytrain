package com.wipro.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.movie.entity.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

}
