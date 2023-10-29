package pe.com.jdmm21.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import pe.com.jdmm21.dto.MovieDTO;
import pe.com.jdmm21.mapper.MovieMapper;
import pe.com.jdmm21.model.MovieEntity;

@ApplicationScoped
public class MovieService {
    @Inject
    MovieMapper mapper;

    // get all movies
    // get movie by id
    // get movie by category
    // get movie by director

    public List<MovieDTO> getAllMovies() {
        List<MovieDTO> dtos = new ArrayList<>();

        // list of movies entities
        List<MovieEntity> entities = Arrays.asList(new MovieEntity(1, "TheGodfather", 1972, 5),
                new MovieEntity(2, "The Godfather: Part II", 1974, 5));

        MovieDTO dto = null;

        for (MovieEntity movieEntity : entities) {
            dto = mapper.toDTO(movieEntity);
            dtos.add(dto);
        }

        return dtos;
    }

    public MovieDTO getMovieById() {
        return mapper.toDTO(new MovieEntity(1, "TheGodfather", 1972, 5));
    }

    public List<MovieDTO> getMovieByCategory() {
        List<MovieDTO> dtos = new ArrayList<>();

        // list of movies entities
        List<MovieEntity> entities = Arrays.asList(new MovieEntity(1, "TheGodfather", 1972, 5),
                new MovieEntity(2, "The Godfather: Part II", 1974, 5));

        MovieDTO dto = null;

        for (MovieEntity movieEntity : entities) {
            dto = mapper.toDTO(movieEntity);
            dtos.add(dto);
        }
        return dtos;
    }

    public List<MovieDTO> getMovieByDirector() {
        List<MovieDTO> dtos = new ArrayList<>();

        // list of movies entities
        List<MovieEntity> entities = Arrays.asList(new MovieEntity(1, "TheGodfather", 1972, 5),
                new MovieEntity(2, "The Godfather: Part II", 1974, 5));

        MovieDTO dto = null;

        for (MovieEntity movieEntity : entities) {
            dto = mapper.toDTO(movieEntity);
            dtos.add(dto);
        }

        return dtos;

    }

    // add stars to movie
    public void addStarsToMovie() {
        mapper.toDTO(new MovieEntity(1, "TheGodfather", 1972, 5));
    }

    // update stars to movie
    public MovieDTO updateStarsToMovie() {
        return mapper.toDTO(new MovieEntity(1, "TheGodfather", 1972, 4));
    }

}
