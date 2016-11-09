package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Theatre {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;

	/**
	 * @param id
	 * @param name
	 */
	public Theatre(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**
	 * @param name
	 */
	public Theatre(String name) {
		super();
		this.name = name;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	
}
