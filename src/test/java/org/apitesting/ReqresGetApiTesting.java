package org.apitesting;
/**
 * @author s.m.govindarajan
 *
 */

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReqresGetApiTesting {
	
	@Test
	public void getListOfUsers()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
		Response res =RestAssured.given().when().get("api/users?page=2");
		
		System.out.println(res.getStatusCode());
		
		System.out.println(res.asString());
	}
	

}
