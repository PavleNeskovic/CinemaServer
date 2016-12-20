package com.example.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.TheatreInsertDto;
import com.example.model.Theatre;
import com.example.service.TheatreService;

@RestController()
public class TheatreController {

	@Autowired
	private TheatreService theatreService;
	
	@PreAuthorize("permitAll")
	@RequestMapping(value = "/theatre/all", method = RequestMethod.GET)
	public ResponseEntity<Collection<Theatre>> getAllTheaters() {
		Collection<Theatre> theaters = theatreService.getAllTheaters();
		return new ResponseEntity<Collection<Theatre>>(theaters, HttpStatus.OK);
	}

	@PreAuthorize("permitAll")
	@RequestMapping(value = "/theatre/new", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TheatreInsertDto> insertNewMovie(@RequestBody TheatreInsertDto dto) {
		theatreService.insertNewTheatre(dto);
		return new ResponseEntity<>(dto, HttpStatus.CREATED);
	}
}
