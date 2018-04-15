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
	
	public Projection addProjection(ProjectionInsertDto dto){
		Movie movieToAdd = movieService.getMovieByTitle(dto.getMovieTitle());
		Theatre theatreToAdd = theatreService.getTheatreByName(dto.getTheatreName());
		//seatsCreated is set to false on creation, PUT method will set this to true when seats are created 
		Projection projection = new Projection(dto.getTime(),movieToAdd,theatreToAdd,false);
		projectionRepository.save(projection);
		return projection;
	}

	public Collection<Projection> getProjectionsByTitle(String title) {
		Movie movieToAdd = movieService.getMovieByTitle(title);
		return projectionRepository.findByMovie(movieToAdd);
	}
	
	public Collection<Projection> getProjectionsById(String id) {
		Movie movieToAdd = movieService.getMovieById(Long.valueOf(id));
		return projectionRepository.findByMovie(movieToAdd);
	}

	public Projection getProjectionById(String id) {
		return projectionRepository.findOne(Long.valueOf(id));
	}
	
	public Projection updateSeatsCreatedById(Long id){
		Projection projection = getProjectionById(String.valueOf(id));
		projection.setSeatsCreated(true);
		projectionRepository.save(projection);
		return projection;
	}
}
