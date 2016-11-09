package com.example.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Movie;
import com.example.model.Projection;
@Repository
public interface ProjectionRepository extends JpaRepository<Projection, Long> {
	Collection<Projection> findByMovie(Movie movie);
}
