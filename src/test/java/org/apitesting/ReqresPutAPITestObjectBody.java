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
public class ReqresPutAPITestObjectBody {


	@Test
	public void toUpdateUserJobUsingPutAndObject()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
		Map<String, Object> payload = new HashMap<String, Object>();
		
		payload.put("name","morpheus");
		
		payload.put("job","zion resident");
		
		Response res =RestAssured.given().contentType(ContentType.JSON).body(payload).when().put("api/users/2");

		
		System.out.println(res.getStatusCode());
		
		System.out.println(res.asString());
	
	}
}
