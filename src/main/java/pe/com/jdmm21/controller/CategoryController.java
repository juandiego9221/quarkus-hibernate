package pe.com.jdmm21.controller;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.openapi.annotations.tags.Tags;

import pe.com.jdmm21.dto.CategoryDTO;
import pe.com.jdmm21.model.CategoryService;

@Path("/categories")
public class CategoryController {
    // inject category service
    @Inject
    CategoryService categoryService;

    @Tags(value = @Tag(name = "Category", description = "Operations related to categories"))
    @GET
    public List<CategoryDTO> getAllCategories() {
        return categoryService.getAllCategories();
    }

}
