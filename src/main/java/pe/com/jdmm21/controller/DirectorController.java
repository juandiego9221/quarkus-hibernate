package pe.com.jdmm21.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import pe.com.jdmm21.dto.DirectorDTOResponse;
import pe.com.jdmm21.service.DirectorService;

@Tag(name = "Director", description = "Operations related to directors")
@Path("/directors")
public class DirectorController {
    @Inject
    DirectorService directorService;

    @Operation(summary = "get director by id", description = "obtener director por id")
    @GET
    @Path("/{id}")
    public DirectorDTOResponse getDirectors(int id) {
        return directorService.getDirectorById(1);
    }

}
