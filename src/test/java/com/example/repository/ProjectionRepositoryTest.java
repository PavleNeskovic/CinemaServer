package com.example.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.model.Movie;
import com.example.model.Projection;
import com.example.model.Theatre;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProjectionRepositoryTest {
	@Autowired
    private TestEntityManager entityManager;
 
    @Autowired
    private ProjectionRepository projectionRepository;
    
	@Test
	public void whenFindByMovie_thenReturnProjection() {
	    // given
	    Projection projection = new Projection("12:30",new Movie("Movie"), new Theatre("Theatre"), false);
	    entityManager.persist(projection);
	    entityManager.flush();
	 
	    // when
	    
	    Collection<Projection> found = projectionRepository.findByMovie(new Movie("Movie"));
	 
	    // then
	    assertThat(found.stream().findFirst().get().getTime())
	      .isEqualTo("12:30");
	}

	
	@Test
	public void whenFindAll_thenReturnProjections() {
	    // given
	    Movie ted = new Movie("Ted");
	    entityManager.persist(ted);
	    entityManager.flush();
	 
	    // when
	    Collection<Projection> movies = projectionRepository.findAll();
	 
	    // then
	    assertThat(movies.size())
	      .isEqualTo(1);
	}
}
