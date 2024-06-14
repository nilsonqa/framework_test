package projeto.api.post;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.response.Response;
import projeto.api.config.RestAssuredConfigSetup;

public class TestPost {


    @BeforeClass
    public static void setup() {
        RestAssuredConfigSetup.setup();
    }

    @Test
    public void testCreateUser() {
        String requestBody = "{\"name\":\"e2etreinamentos\",\"job\":\"leader\"}";

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .extract().response();

        // Verifica a resposta
        String responseBody = response.getBody().asString();
        System.out.println("Response Body: " + responseBody);

        assertEquals("e2etreinamentos", response.jsonPath().getString("name"));
        assertEquals("leader", response.jsonPath().getString("job"));
    }
}