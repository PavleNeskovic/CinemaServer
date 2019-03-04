package com.example.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.model.Theatre;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TheatreRepositoryTest {
	@Autowired
    private TestEntityManager entityManager;
	@Autowired
	private TheatreRepository theatreRepository;
	
	@Test
	public void whenFindByTitle_thenReturnTheatre() {
	    // given
	    Theatre ted = new Theatre("Ted");
	    entityManager.persist(ted);
	    entityManager.flush();
	 
	    // when
	    Theatre found = theatreRepository.findByName(ted.getName());
	 
	    // then
	    assertThat(found.getName())
	      .isEqualTo(ted.getName());
	}

	
	@Test
	public void whenFindAll_thenReturnTheatre() {
	    // given
		Theatre ted = new Theatre("Ted");
	    entityManager.persist(ted);
	    entityManager.flush();
	 
	    // when
	    Collection<Theatre> theatres = theatreRepository.findAll();
	 
	    // then
	    assertThat(theatres.size())
	      .isEqualTo(1);
	}
}
