package com.example.dto;

public class MovieInsertDto {
	private String title;

	/**
	 * 
	 */
	public MovieInsertDto() {
		super();
	}

	/**
	 * @param title
	 */
	public MovieInsertDto(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
