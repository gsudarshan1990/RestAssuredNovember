package org.apitesting;
/**
 * @author s.m.govindarajan
 *
 */

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ReqresAPITestingPost {

	@Test
	public void getPostData() {
		
		RestAssured.baseURI ="https://reqres.in/";
		
		String requestPayload = "{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		
		Response res = RestAssured.given().contentType(ContentType.JSON).body(requestPayload).when().post("api/users");
		
		System.out.println(res.asString());
		
		System.out.println(res.getStatusCode());
		
	}
	
}
