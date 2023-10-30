package pe.com.jdmm21.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import pe.com.jdmm21.dto.MovieDTO;
import pe.com.jdmm21.mapper.MovieMapper;
import pe.com.jdmm21.model.MovieEntity;

@ApplicationScoped
public class MovieService {
    @Inject
    MovieMapper mapper;

    @Inject
    EntityManager em;

    public List<MovieDTO> getAllMovies() {
        List<MovieDTO> movieDTOList = new ArrayList<>();

        List<MovieEntity> movieEntityList = em.createQuery("SELECT m FROM MovieEntity m",
                MovieEntity.class).getResultList();

        MovieDTO movieDTO;

        for (MovieEntity movieEntity : movieEntityList) {
            movieDTO = mapper.toDTO(movieEntity);
            movieDTOList.add(movieDTO);
        }

        return movieDTOList;
    }

    public MovieDTO getMovieById(int id) {
        MovieEntity movieEntity = em.createQuery("SELECT m FROM MovieEntity m WHERE m.id = :id", MovieEntity.class)
                .setParameter("id", id).getSingleResult();

        return mapper.toDTO(movieEntity);
    }

    public List<MovieDTO> getMovieByCategory(int categoryId) {
        List<MovieDTO> movieDTOList = new ArrayList<>();

        List<MovieEntity> movieEntityList = em
                .createQuery("SELECT m FROM MovieEntity m WHERE m.category.id = :categoryId",
                        MovieEntity.class)
                .setParameter("categoryId", categoryId)
                .getResultList();

        MovieDTO movieDTO;

        for (MovieEntity movieEntity : movieEntityList) {
            movieDTO = mapper.toDTO(movieEntity);
            movieDTOList.add(movieDTO);
        }

        return movieDTOList;
    }

    public List<MovieDTO> getMovieByDirector(int directorId) {
        List<MovieDTO> movieDTOList = new ArrayList<>();

        List<MovieEntity> movieEntityList = em
                .createQuery("SELECT m FROM MovieEntity m WHERE m.director.id = :directorId",
                        MovieEntity.class)
                .setParameter("directorId", directorId)
                .getResultList();

        MovieDTO movieDTO;

        for (MovieEntity movieEntity : movieEntityList) {
            movieDTO = mapper.toDTO(movieEntity);
            movieDTOList.add(movieDTO);
        }

        return movieDTOList;

    }

    // add stars to movie
    public void addStarsToMovie() {
        // mapper.toDTO(new MovieEntity(1, "TheGodfather", 1972, 5));
    }

    // update stars to movie
    public MovieDTO updateStarsToMovie() {
        // return mapper.toDTO(new MovieEntity(1, "TheGodfather", 1972, 4));
        return null;
    }

}
