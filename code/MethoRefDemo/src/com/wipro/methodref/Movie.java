package com.wipro.methodref;

public class Movie {

	String movieName;
	String language;
	public Movie(String movieName, String language) {
		super();
		this.movieName = movieName;
		this.language = language;
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
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", language=" + language + "]";
	}
	
	
}
