package pe.com.jdmm21.mapper;

import org.mapstruct.Mapper;

import pe.com.jdmm21.dto.CategoryDTO;
import pe.com.jdmm21.model.CategoryEntity;

@Mapper(componentModel = "cdi")
public interface CategoryMapper {
    CategoryDTO toDTO(CategoryEntity entity);

}
