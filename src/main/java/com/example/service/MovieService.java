package com.example.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.MovieInsertDto;
import com.example.model.Movie;
import com.example.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	public Collection<Movie> getAllMovies(){
		Collection<Movie> movies = movieRepository.findAll();
		return movies;
	}

	public void insertNewMovie(MovieInsertDto dto) {
		Movie newMovie = new Movie(dto.getTitle());
		movieRepository.save(newMovie);
	}
}
