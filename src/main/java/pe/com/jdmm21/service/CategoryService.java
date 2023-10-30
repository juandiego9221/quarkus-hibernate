package pe.com.jdmm21.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import lombok.extern.slf4j.Slf4j;
import pe.com.jdmm21.dto.CategoryDTOResponse;
import pe.com.jdmm21.mapper.CategoryMapper;
import pe.com.jdmm21.model.CategoryEntity;

@Slf4j
@ApplicationScoped
public class CategoryService {
    @Inject
    CategoryMapper mapper;

    @Inject
    EntityManager em;

    // get All categories
    public List<CategoryDTOResponse> getAllCategories() {
        List<CategoryDTOResponse> dtos = new ArrayList<>();

        // list of categories entities
        List<CategoryEntity> entities = em.createQuery("SELECT c FROM CategoryEntity c", CategoryEntity.class)
                .getResultList();

        log.info("size: " + entities.size());
        log.info(Arrays.toString(entities.toArray()));

        CategoryDTOResponse dto = null;
        for (CategoryEntity categoryEntity : entities) {
            dto = mapper.toDTO(categoryEntity);
            dtos.add(dto);
        }

        return dtos;
    }

}
