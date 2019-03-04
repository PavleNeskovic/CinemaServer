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
import com.example.dto.TheatreInsertDto;
import com.example.model.Movie;
import com.example.model.Theatre;
import com.example.repository.MovieRepository;
import com.example.repository.TheatreRepository;

@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
public class TheatreServiceTest {
	private final Theatre thratre = new Theatre("zaphod");
	private final TheatreInsertDto thratreDto = new TheatreInsertDto("zaphod");
 
	@Mock
    private TheatreRepository theatreRepository;
    
    @InjectMocks
    private TheatreService theatreService = new TheatreService();
    
    @Test
    public void givenTheatre_whenGetAll_thenReturnAllTheatres()
      throws Exception {
    	Theatre ted = new Theatre("Ted");
        List<Theatre> allTheatres = Arrays.asList(ted);
        when(theatreRepository.findAll()).thenReturn(allTheatres);
        assertThat(theatreService.getAllTheaters()).isNotNull();
        assertThat(theatreService.getAllTheaters()).containsExactly(ted);
    }
    

    @BeforeEach
    void setMockOutput() {
    	when(theatreRepository.save(any(Theatre.class))).thenReturn(thratre);
    	when(theatreRepository.findByName(any(String.class))).thenReturn(thratre);
    	when(theatreRepository.findAll()).thenReturn(Arrays.asList(thratre));
    }
    
    @Test
    public void whenSaveMovie_assertThatSavedMovieIsNotNull()
      throws Exception {
    	when(theatreRepository.save(any(Theatre.class))).thenReturn(thratre);
    	Theatre savedTheatre = theatreService.insertNewTheatre(thratreDto);
    	  assertThat(savedTheatre).isNotNull();
    }	
}
