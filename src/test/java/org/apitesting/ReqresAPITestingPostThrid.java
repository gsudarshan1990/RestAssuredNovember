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
public class ReqresAPITestingPostThrid {

	@Test
	public void LoginDetailsToGetToken()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
		String payload ="{\r\n"
				+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
				+ "    \"password\": \"cityslicka\"\r\n"
				+ "}";
		
		Response res =RestAssured.given().contentType(ContentType.JSON).body(payload).when().post("api/login");
	
		System.out.println(res.getStatusCode());
		
		System.out.println(res.asString());
	}
}
