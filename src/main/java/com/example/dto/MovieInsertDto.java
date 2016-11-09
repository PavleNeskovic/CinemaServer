package com.example.dto;

public class MovieInsertDto {
	private String title;
	private String description;
	private String imageUrl;

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
	
	

	/**
	 * @param title
	 * @param description
	 * @param imageUrl
	 */
	public MovieInsertDto(String title, String description, String imageUrl) {
		super();
		this.title = title;
		this.description = description;
		this.imageUrl = imageUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}
