/**
 * 
 */
package org.apitesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;

import org.hamcrest.Matcher.*;
/**
 * @author s.m.govindarajan
 *
 */
public class TAUAPITESTING {
	
	@Test
	public void getDetails()
	{
		
		RestAssured.baseURI ="http://api.zippopotam.us/";
		
		Response res = RestAssured.given().when().get("us/90210");
		
		System.out.println(res.getStatusCode());
		
		System.out.println(res.asString());
		
		JsonPath j = new JsonPath(res.asString());
		
		System.out.println(j.get("places[0].'place name'"));
		
		assertEquals(j.get("places[0].'place name'"),"Beverly Hills");
		
		
		
	}

}
