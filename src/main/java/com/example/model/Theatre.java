package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Theatre {
	@Id
	@GeneratedValue
	private Long id;
	
	private String theatreName;

	/**
	 * @param id
	 * @param theatreName
	 */
	public Theatre(Long id, String theatreName) {
		super();
		this.id = id;
		this.theatreName = theatreName;
	}

	/**
	 * @param theatreName
	 */
	public Theatre(String theatreName) {
		super();
		this.theatreName = theatreName;
	}

	/**
	 * 
	 */
	public Theatre() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	
	
}
