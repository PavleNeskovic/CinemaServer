package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.dto.ProjectionInsertDto;

@Entity
public class Projection {
	@Id
	@GeneratedValue
	private Long id;
	
	private String time;
	
	@ManyToOne
	private Movie movie;
	
	@ManyToOne
	private Theatre theatre;
	
	private Boolean seatsCreated;



	/**
	 * @param id
	 * @param time
	 * @param movie
	 * @param theatre
	 * @param seatsCreated
	 */
	public Projection(Long id, String time, Movie movie, Theatre theatre, Boolean seatsCreated) {
		super();
		this.id = id;
		this.time = time;
		this.movie = movie;
		this.theatre = theatre;
		this.seatsCreated = seatsCreated;
	}

	/**
	 * @param time
	 * @param movie
	 * @param theatre
	 */
	public Projection(String time, Movie movie, Theatre theatre, Boolean seatsCreated) {
		super();
		this.time = time;
		this.movie = movie;
		this.theatre = theatre;
		this.seatsCreated = seatsCreated;
	}

	/**
	 * @param time
	 */
	public Projection(String time) {
		super();
		this.time = time;
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
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

	public Boolean getSeatsCreated() {
		return seatsCreated;
	}

	public void setSeatsCreated(Boolean seatsCreated) {
		this.seatsCreated = seatsCreated;
	}
	
	

	

	
	
}
