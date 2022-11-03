package org.apitesting;
/**
 * @author s.m.govindarajan
 *
 */

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReqresAPITesting {
	
	@Test
	public void TestGetReqres()
	{
		
		RestAssured.baseURI = "https://reqres.in/";
		Response res =RestAssured.given().when().get("api/users/2");
		System.out.println(res.statusCode());
		System.out.println(res.body().asString());
		
	}

}
