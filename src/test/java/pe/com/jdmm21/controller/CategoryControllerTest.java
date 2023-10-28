package pe.com.jdmm21.controller;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class CategoryControllerTest {

    @Test
    void getAllCategories() {
        given()
            .when().get("/categories")
            .then()
            .statusCode(200);
    }
    
}
