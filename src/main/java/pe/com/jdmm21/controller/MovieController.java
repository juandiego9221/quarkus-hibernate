package pe.com.jdmm21.controller;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pe.com.jdmm21.dto.MovieDTO;
import pe.com.jdmm21.service.MovieService;

@Path("/movies")
public class MovieController {
    // inject movieService
    @Inject
    MovieService movieService;

    // implement the getAllMovies method
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MovieDTO> getAllMovies() {
        return movieService.getAllMovies();
    }

    // implement the getMovieById method
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public MovieDTO getMovieById() {
        return movieService.getMovieById();
    }

    // implement the getMovieByCategory method
    @GET
    @Path("/categories/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<MovieDTO> getMovieByCategory() {
        return movieService.getMovieByCategory();
    }

    // implement the getMovieByDirector method
    @GET
    @Path("/directors/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<MovieDTO> getMovieByDirector() {
        return movieService.getMovieByDirector();
    }

}