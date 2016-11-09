package com.example.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ProjectionInsertDto;
import com.example.model.Projection;
import com.example.service.ProjectionService;

@RestController
public class ProjectionController {

	@Autowired
	private ProjectionService projectionService;
	
	@RequestMapping(value = "/addProjection", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProjectionInsertDto> insertNewMovie(@RequestBody ProjectionInsertDto dto) {
		projectionService.addProjection(dto);
		return new ResponseEntity<>(dto, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/projections/{title}", method = RequestMethod.GET)
	public ResponseEntity<Collection<Projection>> getProjectionsByTitle(@PathVariable String title) {
		return new ResponseEntity<Collection<Projection>>(projectionService.getProjectionsByTitle(title), HttpStatus.OK);
	}
}
