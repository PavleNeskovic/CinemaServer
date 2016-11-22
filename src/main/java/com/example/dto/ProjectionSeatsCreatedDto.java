package com.example.dto;

public class ProjectionSeatsCreatedDto {
	Long id;

	/**
	 * @param id
	 */
	public ProjectionSeatsCreatedDto(Long id) {
		super();
		this.id = id;
	}
	

	/**
	 * 
	 */
	public ProjectionSeatsCreatedDto() {
		super();
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
