package com.example.dto;

public class ProjectionInsertDto {

	private String movieTitle;
	private String theatreName;
	private String time;

	/**
	 * @param movieTitle
	 * @param theatreName
	 * @param time
	 */
	public ProjectionInsertDto(String movieTitle, String theatreName, String time) {
		super();
		this.movieTitle = movieTitle;
		this.theatreName = theatreName;
		this.time = time;
	}
	/**
	 * 
	 */
	public ProjectionInsertDto() {
		super();
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}	
	
}