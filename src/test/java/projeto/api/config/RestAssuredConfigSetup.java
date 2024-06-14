package projeto.api.config;

import io.restassured.RestAssured;

public class RestAssuredConfigSetup {

	 public static void setup() {
	        RestAssured.baseURI = "https://reqres.in/api";
	    }

}
