package projeto.api.put;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import projeto.api.config.RestAssuredConfigSetup;

public class TestPut {

	 @BeforeClass
	    public static void setup() {
	        RestAssuredConfigSetup.setup();
	    }

	    @Test
	    public void testUpdateUser() {
	        String requestBody = "{\"name\":\"e2etreinamentos\",\"job\":\"QA\"}";

	        Response response = given()
	                .header("Content-Type", "application/json")
	                .body(requestBody)
	                .when()
	                .put("/users/2")
	                .then()
	                .statusCode(200)
	                .extract().response();


	        // Verifica a resposta
	        String responseBody = response.getBody().asString();
	        System.out.println("Response Body: " + responseBody);

	        assertEquals("e2etreinamentos", response.jsonPath().getString("name"));
	        assertEquals("QA", response.jsonPath().getString("job"));
	    }
}