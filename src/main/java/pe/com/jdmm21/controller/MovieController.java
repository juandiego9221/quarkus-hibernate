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
import pe.com.jdmm21.dto.MovieDTOResponse;
import pe.com.jdmm21.dto.RatingDTORequest;
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
    public List<MovieDTOResponse> getAllMovies() {
        return movieService.getAllMovies();
    }

    // implement the getMovieById method
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public MovieDTOResponse getMovieById(int id) {
        return movieService.getMovieById(id);
    }

    @GET
    @Path("/categories/{id}")
    public List<MovieDTOResponse> example(int id) {
        log.info("xxxxx");
        return movieService.getMovieByCategory(id);
    }

    @GET
    @Path("/direc/{id}")
    public List<MovieDTOResponse> example222222(int id) {
        return movieService.getMovieByDirector(id);

    }

    // implement the addStarsToMovie method
    @PATCH
    @Path("/{id}/stars")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateStarsToMovie(RatingDTORequest ratingDTORequest) {
        movieService.updateStarsInMovie(ratingDTORequest);
        return Response.ok().status(201).build();
    }

}