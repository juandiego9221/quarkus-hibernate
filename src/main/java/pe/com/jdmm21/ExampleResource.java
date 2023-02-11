package pe.com.jdmm21;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * ExampleResource
 */

@Path("/example")
@Produces(MediaType.APPLICATION_JSON)
public class ExampleResource {
    @GET
    public String greeting() {
        return "Hello, world!";
    }

    
}