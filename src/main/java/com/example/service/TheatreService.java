package com.example.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.TheatreInsertDto;
import com.example.model.Theatre;
import com.example.repository.MovieRepository;
import com.example.repository.TheatreRepository;

@Service
public class TheatreService {

	@Autowired
	private TheatreRepository theatreRepository;

	public Collection<Theatre> getAllTheaters() {
		return theatreRepository.findAll();
	}

	public void insertNewTheatre(TheatreInsertDto dto) {
		Theatre theatre = new Theatre(dto.getName());
		theatreRepository.save(theatre);
	}
	
	public Theatre getTheatreByName(String name){
		return theatreRepository.findByName(name);
	}
}
