package pe.com.jdmm21.controller;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pe.com.jdmm21.dto.MovieDTO;

@Path("/movies")
public class MovieController {
    

    // implement the getAllMovies method
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MovieDTO> getAllMovies() {
        return Arrays.asList(new MovieDTO(1, "The Godfather", 1972, 5),
                new MovieDTO(2, "The Godfather: Part II", 1974, 5));
    }

    // implement the getMovieById method
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public MovieDTO getMovieById() {
        return new MovieDTO(1, "The Godfather", 1972, 5);
    }

    // implement the getMovieByCategory method
    @GET
    @Path("/categories/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<MovieDTO> getMovieByCategory() {
        return Arrays.asList(new MovieDTO(1, "The Godfather", 1972, 5),
                new MovieDTO(2, "The Godfather: Part II", 1974, 5));
    }

    // implement the getMovieByDirector method
    @GET
    @Path("/directors/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<MovieDTO> getMovieByDirector() {
        return Arrays.asList(new MovieDTO(1, "The Godfather", 1972, 5),
                new MovieDTO(2, "The Godfather: Part II", 1974, 5));
    }

}