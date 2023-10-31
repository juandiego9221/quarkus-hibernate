package pe.com.jdmm21.controller;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
// import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.is;

@QuarkusTest
public class MovieControllerTest {

    @Test
    void getAllMovies() {
        given()
                .when().get("/movies")
                .then()
                .statusCode(200).and()
                .body("size()", is(3));

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

    // test update stars to movie
    @Disabled("Todavia estoy peleando con que no commitee al momento de hacer las pruebas")
    @Test
    void updateStarsToMovie() {
        given()
                .when().patch("/movies/1/reviews")
                .then()
                .statusCode(200);
    }

}