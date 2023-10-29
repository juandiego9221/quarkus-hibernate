package pe.com.jdmm21.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import lombok.extern.slf4j.Slf4j;
import pe.com.jdmm21.dto.MovieDTO;
import pe.com.jdmm21.service.MovieService;

@Slf4j
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
    public MovieDTO getMovieById(int id) {
        return movieService.getMovieById(id);
    }

    @GET
    @Path("/categories/{id}")
    public List<MovieDTO> example(int id) {
        log.info("xxxxx");
        return movieService.getMovieByCategory(id);
    }

    // implement the getMovieByDirector method
    @GET
    @Path("/directors/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<MovieDTO> getMovieByDirector(String director) {
        return movieService.getMovieByDirector(director);
    }

    // implement the addStarsToMovie method
    @POST
    @Path("/{id}/stars/{stars}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response addStarsToMovie() {
        movieService.addStarsToMovie();
        return Response.ok().status(201).build();
    }

    // implement the updateStarsToMovie method
    @PATCH
    @Path("/{id}/stars/{stars}")
    @Produces(MediaType.APPLICATION_JSON)
    public MovieDTO updateStarsToMovie() {
        return movieService.updateStarsToMovie();
    }

}