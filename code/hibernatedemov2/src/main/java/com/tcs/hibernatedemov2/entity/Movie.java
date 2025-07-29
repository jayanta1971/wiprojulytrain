package com.tcs.hibernatedemov2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="movie_name")
	String movieName;
	
	@Column(name="movie_lng")
	String language;
	
	@Column(name="movie_rating")
	double movieRating;
	
	

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(int id, String movieName, String language, double movieRating) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.language = language;
		this.movieRating = movieRating;
	}
	
	

	public Movie(String movieName, String language, double movieRating) {
		super();
		this.movieName = movieName;
		this.language = language;
		this.movieRating = movieRating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(double movieRating) {
		this.movieRating = movieRating;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + ", language=" + language + ", movieRating="
				+ movieRating + "]";
	}
	
	
	
	

}
