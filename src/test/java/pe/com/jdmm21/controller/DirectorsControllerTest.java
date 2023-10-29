package pe.com.jdmm21.controller;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class DirectorsControllerTest {

    @Test
    void getDirectorById() {
        given()
                .when().get("/directors/1")
                .then()
                .statusCode(200);
    }

}
