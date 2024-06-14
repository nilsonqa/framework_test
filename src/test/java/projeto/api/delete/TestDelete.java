package projeto.api.delete;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import io.restassured.response.Response;
import projeto.api.config.RestAssuredConfigSetup;

public class TestDelete {

	@BeforeClass
	public static void setup() {
		RestAssuredConfigSetup.setup();
	}

	@Test
	public void testDeleteUser() {
		Response response = given().when().delete("/users/2").then().statusCode(204).extract().response();

		// Verifica a resposta
		assertEquals(204, response.getStatusCode());
	}
}