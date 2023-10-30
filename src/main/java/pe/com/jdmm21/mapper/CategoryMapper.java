package pe.com.jdmm21.mapper;

import org.mapstruct.Mapper;

import pe.com.jdmm21.dto.CategoryDTOResponse;
import pe.com.jdmm21.model.CategoryEntity;

@Mapper(componentModel = "cdi")
public interface CategoryMapper {
    CategoryDTOResponse toDTO(CategoryEntity entity);

}
