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
        String message ="";
        message = validationMessage();
        return message;
    }

    private String validationMessage() {
        String message;
        if (true) {
            message="hola1";
        }else{
            message="hola2";
        }
        return message;
    }

}