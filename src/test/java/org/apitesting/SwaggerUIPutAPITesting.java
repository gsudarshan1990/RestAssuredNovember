/**
 * 
 */
package org.apitesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

/**
 * @author s.m.govindarajan
 *
 */
public class SwaggerUIPutAPITesting {
	
	@Test
	public void toUpdateExtingPetDetails()
	{
		
		 RestAssured.baseURI ="https://petstore.swagger.io/v2/";
		 
		 String payload = "{\r\n"
		 		+ "  \"id\": 0,\r\n"
		 		+ "  \"category\": {\r\n"
		 		+ "    \"id\": 0,\r\n"
		 		+ "    \"name\": \"string\"\r\n"
		 		+ "  },\r\n"
		 		+ "  \"name\": \"doggie\",\r\n"
		 		+ "  \"photoUrls\": [\r\n"
		 		+ "    \"string\"\r\n"
		 		+ "  ],\r\n"
		 		+ "  \"tags\": [\r\n"
		 		+ "    {\r\n"
		 		+ "      \"id\": 0,\r\n"
		 		+ "      \"name\": \"string\"\r\n"
		 		+ "    }\r\n"
		 		+ "  ],\r\n"
		 		+ "  \"status\": \"available\"\r\n"
		 		+ "}";
		 
		 Response res =RestAssured.given().contentType(ContentType.JSON).body(payload).when().put("pet");
	
		 System.out.println(res.getStatusCode());
		 
		 System.out.println(res.asString());
	}

}
