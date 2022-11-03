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
public class SwaggerUIPostAPITestingSecond {
	
	@Test
	public void toPostOrderForPet()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2/";
		
		String payload ="{\r\n"
				+ "  \"id\": 10,\r\n"
				+ "  \"petId\": 10,\r\n"
				+ "  \"quantity\": 2,\r\n"
				+ "  \"shipDate\": \"2022-11-03T06:24:00.040Z\",\r\n"
				+ "  \"status\": \"placed\",\r\n"
				+ "  \"complete\": true\r\n"
				+ "}";
		
		Response res = RestAssured.given().contentType(ContentType.JSON).body(payload).when().post("store/order");
		
		System.out.println(res.getStatusCode());
		
		System.out.println(res.asString());
	}
}
