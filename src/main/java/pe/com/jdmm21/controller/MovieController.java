package pe.com.jdmm21.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import lombok.extern.slf4j.Slf4j;
import pe.com.jdmm21.dto.MovieDTOResponse;
import pe.com.jdmm21.dto.RatingDTORequest;
import pe.com.jdmm21.service.MovieService;

@Tag(name = "Movie", description = "Operations related to movies")
@Slf4j
@Path("/movies")
public class MovieController {
    // inject movieService
    @Inject
    MovieService movieService;

    // implement the getAllMovies method
    @Operation(summary = "get all movies", description = "Listar todas las peliculas")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MovieDTOResponse> getAllMovies() {
        return movieService.getAllMovies();
    }

    // implement the getMovieById method
    @Operation(summary = "get movie by id", description = "Ver detalles de una pelicula especifica")
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public MovieDTOResponse getMovieById(int id) {
        return movieService.getMovieById(id);
    }

    @Operation(summary = "get movie by category", description = "Listar todas las peliculas de una categoria especifica")
    @GET
    @Path("/categories/{id}")
    public List<MovieDTOResponse> example(int id) {
        log.info("xxxxx");
        return movieService.getMovieByCategory(id);
    }

    @Operation(summary = "get movie by director", description = "Listar todas las peliculas de un director especifico")
    @GET
    @Path("/directors/{id}")
    public List<MovieDTOResponse> getMovieByDirector(int id) {
        return movieService.getMovieByDirector(id);
    }

    // implement the addStarsToMovie method
    @Operation(summary = "add stars to movie", description = "Agregar estrellas a una pelicula especifica")
    @PATCH
    @Path("/{id}/reviews")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateStarsToMovie(RatingDTORequest ratingDTORequest) {
        movieService.updateStarsInMovie(ratingDTORequest);
        return Response.ok().status(201).build();
    }

}