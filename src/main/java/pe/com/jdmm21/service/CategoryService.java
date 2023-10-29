package pe.com.jdmm21.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import pe.com.jdmm21.dto.CategoryDTO;
import pe.com.jdmm21.mapper.CategoryMapper;
import pe.com.jdmm21.model.CategoryEntity;

@ApplicationScoped
public class CategoryService {
    @Inject
    CategoryMapper mapper;

    // get All categories
    public List<CategoryDTO> getAllCategories() {
        List<CategoryDTO> dtos = new ArrayList<>();

        // list of categories entities
        List<CategoryEntity> entities = Arrays.asList(new CategoryEntity(1, "Action", "Action movies"),
                new CategoryEntity(2, "Comedy", "Comedy movies"));

        CategoryDTO dto = null;
        for (CategoryEntity categoryEntity : entities) {
            dto = mapper.toDTO(categoryEntity);
            dtos.add(dto);
        }

        return dtos;
    }

}
