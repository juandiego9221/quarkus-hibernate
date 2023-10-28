package pe.com.jdmm21.controller;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import pe.com.jdmm21.model.CategoryEntity;

@Path("/categories")
public class CategoryController {

    
    @GET
    public List<CategoryEntity> getAllCategories() {
        // return a list of categories
        return Arrays.asList(new CategoryEntity(1, "Action", "Action movies"),
                new CategoryEntity(2, "Comedy", "Comedy movies"));

    }

}
