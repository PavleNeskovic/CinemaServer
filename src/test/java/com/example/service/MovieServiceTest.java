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
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.dto.MovieInsertDto;
import com.example.model.Movie;
import com.example.repository.MovieRepository;

@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
public class MovieServiceTest {
	
	private final Movie movie = new Movie("zaphod","desc","url");
	private final MovieInsertDto movieDto = new MovieInsertDto("zaphod","desc","url");
 
	@Mock
    private MovieRepository movieRepository;
    
    @InjectMocks
    private MovieService movieService = new MovieServiceImpl();
    
    @BeforeEach
    void setMockOutput() {
    	when(movieRepository.save(any(Movie.class))).thenReturn(movie);
    	when(movieRepository.findByTitle(any(String.class))).thenReturn(movie);
    	when(movieRepository.findById((any(Long.class)))).thenReturn(movie);
    	when(movieRepository.findAll()).thenReturn(Arrays.asList(movie));
    }
    
    @Test
    public void givenMovie_whenGetAll_thenReturnAllMovies()
      throws Exception {
    	Movie ted = new Movie("Ted");
        List<Movie> allMovies = Arrays.asList(ted);
        when(movieRepository.findAll()).thenReturn(allMovies);
        assertThat(movieService.getAllMovies()).isNotNull();
        assertThat(movieService.getAllMovies()).containsExactly(ted);
    }
    
    @Test
    public void whenSaveMovie_assertThatSavedMovieIsNotNull()
      throws Exception {
    	when(movieRepository.save(any(Movie.class))).thenReturn(movie);
    	  Movie savedMovie = movieService.insertNewMovie(movieDto);
    	  assertThat(savedMovie).isNotNull();
    }	
}
