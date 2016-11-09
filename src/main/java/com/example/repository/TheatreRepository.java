package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Theatre;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Long> {
	public Theatre findByName(String name);
}
