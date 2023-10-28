package pe.com.jdmm21.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pe.com.jdmm21.model.ExampleResponse;

@Path("/movies")
public class MovieController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ExampleResponse hello() {
        return new ExampleResponse("Hello RESTEasy");
    }
}