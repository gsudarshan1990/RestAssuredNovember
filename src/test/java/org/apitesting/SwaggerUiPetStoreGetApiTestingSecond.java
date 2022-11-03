package org.apitesting;
/**
 * @author s.m.govindarajan
 *
 */
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SwaggerUiPetStoreGetApiTestingSecond {
	
	@Test
	public void getPetDetails()
	{
		
		RestAssured.baseURI = "https://petstore.swagger.io/v2/";
		
		Response res = RestAssured.given().when().get("pet/10");
		
		System.out.println(res.getStatusCode());
		
		System.out.println(res.asString());
		
	}

}
