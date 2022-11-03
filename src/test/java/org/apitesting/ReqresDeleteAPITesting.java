/**
 * 
 */
package org.apitesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

/**
 * @author s.m.govindarajan
 *
 */
public class ReqresDeleteAPITesting {

	@Test
	public void toDeleteRecord()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
		Response res = RestAssured.given().when().delete("api/users/2");
		
		System.out.println(res.asString());
		
		System.out.println(res.getStatusCode());
		
		
		
	}
	
}
