package pe.com.jdmm21.controller;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.module.jsv.JsonSchemaValidator;

@QuarkusTest
public class CategoryControllerTest {

    @Test
    void getAllCategories() {
        // add a json schema validator
        JsonSchemaValidator validator = JsonSchemaValidator
                .matchesJsonSchemaInClasspath("schemas/categoriesList.json");

        given()
                .when().get("/categories")
                .then()
                .statusCode(200)
                .body(validator);
    }

}
