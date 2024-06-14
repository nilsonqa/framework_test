package projeto.api.get;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.response.Response;
import projeto.api.config.RestAssuredConfigSetup;

public class TestGet {

	 @BeforeClass
	public static void setup() {
		RestAssuredConfigSetup.setup();
	}

	@Test
	public void testGetUser() {
		Response response = given().when().get("/users/2").then().statusCode(200).extract().response();

		assertEquals(2, response.jsonPath().getInt("data.id"));
		assertEquals("janet.weaver@reqres.in", response.jsonPath().getString("data.email"));
		assertEquals("Janet", response.jsonPath().getString("data.first_name"));
		assertEquals("Weaver", response.jsonPath().getString("data.last_name"));
	}
}