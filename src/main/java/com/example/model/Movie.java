package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
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
	
	
}
