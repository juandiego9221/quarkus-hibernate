package pe.com.jdmm21.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.openapi.annotations.tags.Tags;

import pe.com.jdmm21.dto.CategoryDTOResponse;
import pe.com.jdmm21.service.CategoryService;

@Path("/categories")
public class CategoryController {
    @Inject
    CategoryService categoryService;

    @Tags(value = @Tag(name = "Category", description = "Operations related to categories"))
    @GET
    public List<CategoryDTOResponse> getAllCategories() {
        return categoryService.getAllCategories();
    }

}
