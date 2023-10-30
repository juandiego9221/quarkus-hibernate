package pe.com.jdmm21.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import pe.com.jdmm21.dto.MovieDTOResponse;
import pe.com.jdmm21.dto.RatingDTORequest;
import pe.com.jdmm21.mapper.MovieMapper;
import pe.com.jdmm21.model.MovieEntity;

@ApplicationScoped
public class MovieService {
    @Inject
    MovieMapper mapper;

    @Inject
    EntityManager em;

    public List<MovieDTOResponse> getAllMovies() {
        List<MovieDTOResponse> movieDTOList = new ArrayList<>();

        List<MovieEntity> movieEntityList = em.createQuery("SELECT m FROM MovieEntity m",
                MovieEntity.class).getResultList();

        MovieDTOResponse movieDTO;

        for (MovieEntity movieEntity : movieEntityList) {
            movieDTO = mapper.toDTO(movieEntity);
            movieDTOList.add(movieDTO);
        }

        return movieDTOList;
    }

    public MovieDTOResponse getMovieById(int id) {
        MovieEntity movieEntity = em.createQuery("SELECT m FROM MovieEntity m WHERE m.id = :id", MovieEntity.class)
                .setParameter("id", id).getSingleResult();

        return mapper.toDTO(movieEntity);
    }

    public List<MovieDTOResponse> getMovieByCategory(int categoryId) {
        List<MovieDTOResponse> movieDTOList = new ArrayList<>();

        List<MovieEntity> movieEntityList = em
                .createQuery("SELECT m FROM MovieEntity m WHERE m.category.id = :categoryId",
                        MovieEntity.class)
                .setParameter("categoryId", categoryId)
                .getResultList();

        MovieDTOResponse movieDTO;

        for (MovieEntity movieEntity : movieEntityList) {
            movieDTO = mapper.toDTO(movieEntity);
            movieDTOList.add(movieDTO);
        }

        return movieDTOList;
    }

    public List<MovieDTOResponse> getMovieByDirector(int directorId) {
        List<MovieDTOResponse> movieDTOList = new ArrayList<>();

        List<MovieEntity> movieEntityList = em
                .createQuery("SELECT m FROM MovieEntity m WHERE m.director.id = :directorId",
                        MovieEntity.class)
                .setParameter("directorId", directorId)
                .getResultList();

        MovieDTOResponse movieDTO;

        for (MovieEntity movieEntity : movieEntityList) {
            movieDTO = mapper.toDTO(movieEntity);
            movieDTOList.add(movieDTO);
        }

        return movieDTOList;

    }

    @Transactional
    // add stars to movie
    public void updateStarsInMovie(RatingDTORequest ratingDTORequest) {
        // create a query to insert stars to movie
        em.createQuery("UPDATE MovieEntity m SET m.stars = :stars WHERE m.id = :id",
                MovieEntity.class)
                .setParameter("stars", ratingDTORequest.getPuntuation())
                .setParameter("id", 1)
                .executeUpdate();
    }

}
