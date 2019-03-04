package com.example.service;

import java.util.Collection;

import com.example.dto.MovieInsertDto;
import com.example.model.Movie;

public interface MovieService {
	public Collection<Movie> getAllMovies();

	public Movie insertNewMovie(MovieInsertDto dto);

	public Movie getMovieByTitle(String title);
	
	public Movie getMovieById(Long id);
}
