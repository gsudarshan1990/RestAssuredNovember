package org.apitesting;
/**
 * @author s.m.govindarajan
 *
 */
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReqresAPITestingPathAndQueryParameter {

	@Test
	public void getDataUsingPathandQueryParameter()
	{
		
		//query parameter
		RestAssured.baseURI = "https://reqres.in/";
		
		Response res =RestAssured.given().when().param("page", 2).get("api/users");
	
		System.out.println(res.asPrettyString());
		
		System.out.println(res.getStatusCode());
		
		//path parameter
			
		Response resSecond = RestAssured.given().when().param("id", 2).get("api/user");
		
		System.out.println(resSecond.getStatusCode());
		
		System.out.println(resSecond.asString());
	}
	
}
