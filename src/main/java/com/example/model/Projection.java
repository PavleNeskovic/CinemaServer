package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Projection {
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Movie movie;
	
	@ManyToOne
	private Theatre theatre;

	/**
	 * @param id
	 * @param movie
	 * @param theatre
	 */
	public Projection(Long id, Movie movie, Theatre theatre) {
		super();
		this.id = id;
		this.movie = movie;
		this.theatre = theatre;
	}

	/**
	 * 
	 */
	public Projection() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	
	
}
