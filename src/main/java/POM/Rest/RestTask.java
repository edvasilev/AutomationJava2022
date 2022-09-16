package POM.Rest;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class RestTask {
    @BeforeEach
    public void Setup() {

    }
     @Test
    public void RestTask() {

        Response response = given().when().get("https://swapi.dev/api/people/1").then().extract().response();
        int StatusCode = response.getStatusCode();
        Assertions.assertEquals(StatusCode, 200);
        System.out.println(response.body().asPrettyString());
        Assertions.assertEquals("Luke Skywalker", response.jsonPath().getString("name"));
        Assertions.assertEquals("172", response.jsonPath().getString("height"));
        Assertions.assertEquals("77", response.jsonPath().getString("mass"));
        Assertions.assertEquals("blond", response.jsonPath().getString("hair_color"));
        Assertions.assertEquals("fair", response.jsonPath().getString("skin_color"));
    }

}