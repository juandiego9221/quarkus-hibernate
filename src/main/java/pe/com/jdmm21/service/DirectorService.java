package pe.com.jdmm21.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import pe.com.jdmm21.dto.DirectorDTO;
import pe.com.jdmm21.mapper.DirectorMapper;
import pe.com.jdmm21.model.DirectorEntity;

@ApplicationScoped
public class DirectorService {
    @Inject
    DirectorMapper mapper;

    // geet director by id
    public DirectorDTO getDirectorById() {
        DirectorEntity entity = new DirectorEntity(1, "James Cameron", "Canada", true);

        return mapper.toDTO(entity);
    }

}
