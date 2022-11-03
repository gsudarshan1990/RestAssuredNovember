package org.apitesting;
/**
 * @author s.m.govindarajan
 *
 */
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SwaggerUiPetStoreApiTestingPathAndQueryParameter {

	
	@BeforeTest
	public void setUp()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2/";
	}
	
	@Test
	public void SwaggerUIPathAndQueryParameter()
	{
		
		//queryParameter
		
		Response res =RestAssured.given().when().get("pet/10");
		
		System.out.println(RestAssured.baseURI);
		
		System.out.println(res.asString());
		
		System.out.println(res.getStatusCode());
	}
}
