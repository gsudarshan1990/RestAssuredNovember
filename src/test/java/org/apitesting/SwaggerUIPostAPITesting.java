package org.apitesting;
/**
 * @author s.m.govindarajan
 *
 */

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SwaggerUIPostAPITesting {
	
	@Test
	public void addNewPetToStore()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2/";
		
		String payload ="{\r\n"
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
		
		Response res =RestAssured.given().contentType(ContentType.JSON).body(payload).when().post("pet");
		
		System.out.println(res.asString());
		
				
		System.out.println(res.getStatusCode());
	}

}
