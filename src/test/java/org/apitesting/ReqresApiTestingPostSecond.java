package org.apitesting;
/**
 * @author s.m.govindarajan
 *
 */

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ReqresApiTestingPostSecond {
	
	@Test
	public void postToGetRegistered()
	{
		RestAssured.baseURI ="https://reqres.in/";
		
		String requestBody = "{\r\n"
				+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
				+ "    \"password\": \"pistol\"\r\n"
				+ "}";
		
		Response res =RestAssured.given().contentType(ContentType.JSON).body(requestBody).when().post("api/register");
		
		System.out.println(res.getStatusCode());
		
		System.out.println(res.asString());
	}

}
