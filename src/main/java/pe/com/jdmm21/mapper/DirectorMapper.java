package pe.com.jdmm21.mapper;

import org.mapstruct.Mapper;

import pe.com.jdmm21.dto.DirectorDTOResponse;
import pe.com.jdmm21.model.DirectorEntity;

@Mapper(componentModel = "cdi")
public interface DirectorMapper {
    DirectorDTOResponse toDTO(DirectorEntity entity);
}
