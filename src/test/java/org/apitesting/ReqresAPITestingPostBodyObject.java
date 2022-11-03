/**
 * 
 */
package org.apitesting;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

/**
 * @author s.m.govindarajan
 *
 */
public class ReqresAPITestingPostBodyObject {
	
	
	@Test
	public void toCreateUserThroughPost()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
		Map<String, Object> payload = new HashMap<String, Object>();
		
		payload.put("name", "morpheus");
		payload.put("job","leader");
		
		Response res =RestAssured.given().contentType(ContentType.JSON).body(payload).when().post("api/users");
		
		System.out.println(res.getStatusCode());
		
		System.out.println(res.asString());
	}

}
