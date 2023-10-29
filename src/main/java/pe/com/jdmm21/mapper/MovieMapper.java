package pe.com.jdmm21.mapper;

import org.mapstruct.Mapper;

import pe.com.jdmm21.dto.MovieDTO;
import pe.com.jdmm21.model.MovieEntity;

@Mapper(componentModel = "cdi")
public interface MovieMapper {

    MovieDTO toDTO(MovieEntity entity);

}
