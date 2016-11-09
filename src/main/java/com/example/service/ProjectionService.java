package com.example.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.ProjectionInsertDto;
import com.example.model.Movie;
import com.example.model.Projection;
import com.example.model.Theatre;
import com.example.repository.ProjectionRepository;

@Service
public class ProjectionService {
	
	@Autowired
	private ProjectionRepository projectionRepository;
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private TheatreService theatreService;
	
	public void addProjection(ProjectionInsertDto dto){
		Movie movieToAdd = movieService.getMovieByTitle(dto.getMovieTitle());
		Theatre theatreToAdd = theatreService.getTheatreByName(dto.getTheatreName());
		Projection projection = new Projection(dto.getTime(),movieToAdd,theatreToAdd);
		projectionRepository.save(projection);
	}

	public Collection<Projection> getProjectionsByTitle(String title) {
		Movie movieToAdd = movieService.getMovieByTitle(title);
		return projectionRepository.findByMovie(movieToAdd);
	}
}
