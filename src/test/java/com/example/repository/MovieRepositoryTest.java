package com.example.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.model.Movie;

import antlr.collections.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MovieRepositoryTest {
	@Autowired
    private TestEntityManager entityManager;
 
    @Autowired
    private MovieRepository movieRepository;
    
	@Test
	public void whenFindByTitle_thenReturnMovie() {
	    // given
	    Movie ted = new Movie("Ted");
	    entityManager.persist(ted);
	    entityManager.flush();
	 
	    // when
	    Movie found = movieRepository.findByTitle(ted.getTitle());
	 
	    // then
	    assertThat(found.getTitle())
	      .isEqualTo(ted.getTitle());
	}

	
	@Test
	public void whenFindAll_thenReturnMovie() {
	    // given
	    Movie ted = new Movie("Ted");
	    entityManager.persist(ted);
	    entityManager.flush();
	 
	    // when
	    Collection<Movie> movies = movieRepository.findAll();
	 
	    // then
	    assertThat(movies.size())
	      .isEqualTo(1);
	}
}
