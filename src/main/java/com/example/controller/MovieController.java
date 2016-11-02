package com.example.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.MovieInsertDto;
import com.example.model.Movie;
import com.example.service.MovieService;

@RestController()
public class MovieController {

	@Autowired
	private MovieService movieService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<Collection<Movie>> getAllMovies() {
		return new ResponseEntity<Collection<Movie>>(movieService.getAllMovies(), HttpStatus.OK);
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MovieInsertDto> insertNewMovie(@RequestBody MovieInsertDto dto) {
		movieService.insertNewMovie(dto);
		return new ResponseEntity<>(dto, HttpStatus.CREATED);
	}

}
