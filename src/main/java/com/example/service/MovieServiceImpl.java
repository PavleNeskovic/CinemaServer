package com.example.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.MovieInsertDto;
import com.example.model.Movie;
import com.example.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieRepository movieRepository;
	
	public Collection<Movie> getAllMovies(){
		return movieRepository.findAll();
	}

	public Movie insertNewMovie(MovieInsertDto dto) {
		return movieRepository.save(new Movie(dto.getTitle(),dto.getDescription(),dto.getImageUrl()));
	}

	public Movie getMovieByTitle(String title) {
		return movieRepository.findByTitle(title);
	}
	
	public Movie getMovieById(Long id) {
		return movieRepository.findById(id);
	}
}
