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
public class ReqresPutAPITestingFirst {
	
	@Test
	public void toUpdateUserJobThroughPut()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
		String payload = "{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}";
		
		Response res =RestAssured.given().contentType(ContentType.JSON).body(payload).when().put("api/user/2");
		
		System.out.println(res.asString());
		
		System.out.println(res.getStatusCode());
		
	}

}
