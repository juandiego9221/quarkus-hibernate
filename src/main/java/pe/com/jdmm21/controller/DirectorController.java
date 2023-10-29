package pe.com.jdmm21.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import pe.com.jdmm21.dto.DirectorDTO;
import pe.com.jdmm21.service.DirectorService;

@Path("/directors")
public class DirectorController {
    @Inject
    DirectorService directorService;

    // implement the getDirectorById method
    @GET
    @Path("/{id}")
    public DirectorDTO getDirectorById() {
        return directorService.getDirectorById();
    }

}
