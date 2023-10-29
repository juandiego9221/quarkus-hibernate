package pe.com.jdmm21.controller;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class MovieControllerTest {

    @Test
    void getAllMovies() {
        given()
                .when().get("/movies")
                .then()
                .statusCode(200);
    }

    // test get movies by id
    @Test
    void getMovieById() {
        given()
                .when().get("/movies/1")
                .then()
                .statusCode(200);
    }

    // test get a movie by a specific category
    @Test
    void getMovieByCategory() {
        given()
                .when().get("/movies/categories/1")
                .then()
                .statusCode(200);
    }

    @Test
    void getMovieByDirector() {
        given()
                .when().get("/movies/directors/1")
                .then()
                .statusCode(200);
    }

    // test add stars to movie
    @Test
    void addStarsToMovie() {
        given()
                .when().post("/movies/1/stars/5")
                .then()
                .statusCode(201);
    }

    // test update stars to movie
    @Test
    void updateStarsToMovie() {
        given()
                .when().patch("/movies/1/stars/5")
                .then()
                .statusCode(200);
    }

}