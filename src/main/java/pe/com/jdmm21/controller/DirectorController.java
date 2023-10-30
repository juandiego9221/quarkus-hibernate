package pe.com.jdmm21.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import pe.com.jdmm21.dto.DirectorDTOResponse;
import pe.com.jdmm21.service.DirectorService;

@Path("/directors")
public class DirectorController {
    @Inject
    DirectorService directorService;



    @GET
    @Path("/{id}")
    public DirectorDTOResponse getDirectors(int id){
        return directorService.getDirectorById(1);
    }

}
