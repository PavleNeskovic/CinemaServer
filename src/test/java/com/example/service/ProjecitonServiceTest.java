package com.example.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.dto.MovieInsertDto;
import com.example.dto.ProjectionInsertDto;
import com.example.model.Movie;
import com.example.model.Projection;
import com.example.model.Theatre;
import com.example.repository.MovieRepository;
import com.example.repository.ProjectionRepository;

@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
public class ProjecitonServiceTest {
	final Movie movie = new Movie("zaphod","desc","url");
	final MovieInsertDto movieDto = new MovieInsertDto("zaphod","desc","url");
	final Projection projection = new Projection("12:30",new Movie("Movie"), new Theatre("Theatre"), false);
	   
 
	@Mock 
	ProjectionRepository projectionRepository;
    
    @InjectMocks
    ProjectionService projectionService = new ProjectionService();
    
    @Test
    public void givenMovie_whenGetAll_thenReturnAllMovies()
      throws Exception {
        List<Projection> allMovies = Arrays.asList(projection);
        when(projectionRepository.findAll()).thenReturn(allMovies);
        assertThat(projectionService.getProjectionsById("1")).isNotNull();
        assertThat(projectionService.getProjectionsById("1")).containsExactly(projection);
    }
    

    @BeforeEach
    void setMockOutput() {
    	when(projectionRepository.save(any(Projection .class))).thenReturn(projection);
    	when(projectionRepository.findByMovie(any(Movie.class))).thenReturn(Arrays.asList(projection));
    	when(projectionRepository.findAll()).thenReturn(Arrays.asList(projection));
    }
    
    @Test
    public void whenSaveMovie_assertThatSavedMovieIsNotNull()
      throws Exception {
    	when(projectionRepository.save(any(Projection.class))).thenReturn(projection);
    	Projection savedProjection = projectionService.addProjection(new ProjectionInsertDto("Movie", "Theatre", "12:30"));
    	  assertThat(savedProjection).isNotNull();
    }	
}
