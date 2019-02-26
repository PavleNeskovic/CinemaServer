package com.example.dto;

public class TheatreInsertDto {
	
	private String name;

	/**
	 * @param name
	 */
	public TheatreInsertDto(String name) {
		super();
		this.name = name;
	}

	/**
	 * 
	 */
	public TheatreInsertDto() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
