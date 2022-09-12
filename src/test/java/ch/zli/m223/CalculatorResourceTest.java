package ch.zli.m223;



import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Test;



import static io.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.is;



@QuarkusTest

public class CalculatorResourceTest {



    @Test

    public void testHelloEndpoint() {

        given()

          .when().get("/calculator")

          .then()

             .statusCode(200)

             .body(is("Hello from RESTEasy Reactive"));

    }



    @Test

    public void testCalcTwoNumbers() {

        given()

        .when().get("/calculator/20/30")

        .then()

        .statusCode(200)

        .body(is(50));

    }



}