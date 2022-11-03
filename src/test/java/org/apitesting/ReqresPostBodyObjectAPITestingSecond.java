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
public class ReqresPostBodyObjectAPITestingSecond {

	@Test
	public void toRegisterThroughPost()
	{
		RestAssured.baseURI ="https://reqres.in/";
		
		Map<String, Object> payload = new HashMap<String,Object>();
		
		payload.put("email", "eve.holt@reqres.in");
		
		payload.put("password", "pistol");
		
		Response res = RestAssured.given().contentType(ContentType.JSON).body(payload).when().post("api/register");
		
		System.out.println(res.asString());
		
		System.out.println(res.getStatusCode());
	}
}
