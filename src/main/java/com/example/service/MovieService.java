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
		return movieRepository.findAll();
	}

	public void insertNewMovie(MovieInsertDto dto) {
		movieRepository.save(new Movie(dto.getTitle(),dto.getDescription(),dto.getImageUrl()));
	}

	public Movie getMovieByTitle(String title) {
		return movieRepository.findByTitle(title);
	}
}
