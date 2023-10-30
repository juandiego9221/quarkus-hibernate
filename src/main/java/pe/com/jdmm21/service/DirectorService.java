package pe.com.jdmm21.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import pe.com.jdmm21.dto.DirectorDTOResponse;
import pe.com.jdmm21.mapper.DirectorMapper;
import pe.com.jdmm21.model.DirectorEntity;

@ApplicationScoped
public class DirectorService {

    @Inject
    DirectorMapper mapper;

    @Inject
    EntityManager em;

    // geet director by id
    public DirectorDTOResponse getDirectorById(int directorId) {
        DirectorEntity directorEntity = em.createQuery("SELECT d FROM DirectorEntity d WHERE d.id = :id", DirectorEntity.class)
                .setParameter("id", directorId).getSingleResult();

        return mapper.toDTO(directorEntity);
    }

}
