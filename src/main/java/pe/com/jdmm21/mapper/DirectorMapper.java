package pe.com.jdmm21.mapper;

import org.mapstruct.Mapper;

import pe.com.jdmm21.dto.DirectorDTO;
import pe.com.jdmm21.model.DirectorEntity;

@Mapper(componentModel = "cdi")
public interface DirectorMapper {
    DirectorDTO toDTO(DirectorEntity entity);
}
