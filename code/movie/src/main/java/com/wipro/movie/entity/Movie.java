package com.wipro.movie.entity;

 

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="movie")
@Data
public class Movie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="movie_name")
	String movieName;
	@Column(name="movie_language")
	String movieLanguage;
	@Column(name="movie_image")
	String movieImage;
	@Column(name="ticket_price")
	double ticketPrice;

}
