package org.apitesting;
/**
 * @author s.m.govindarajan
 *
 */
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SwaggerUiPetstoreGetApiTesting {
	
	@Test
	public void getSwaggerUiData()
	{
		
		RestAssured.baseURI = "https://petstore.swagger.io/v2/";
		
		Response res =RestAssured.given().when().get("pet/findByStatus?status=available");
		
		System.out.println(res.getStatusCode());
		
		System.out.println(res.asString());
		
		
	}

}
