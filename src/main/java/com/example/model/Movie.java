package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue
	private Long id;
	private String title = "";
	private String description = "";
	private String imageUrl = "";
	/**
	 * 
	 */
	public Movie() {
		super();
	}
	/**
	 * @param id
	 * @param title
	 */
	public Movie(Long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	/**
	 * @param title
	 * @param description
	 * @param imageUrl
	 */
	public Movie(String title, String description, String imageUrl) {
		super();
		this.title = title;
		this.description = description;
		this.imageUrl = imageUrl;
	}
	/**
	 * @param id
	 * @param title
	 * @param description
	 * @param imageUrl
	 */
	public Movie(Long id, String title, String description, String imageUrl) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.imageUrl = imageUrl;
	}
	/**
	 * @param title
	 */
	public Movie(String title) {
		super();
		this.title = title;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
