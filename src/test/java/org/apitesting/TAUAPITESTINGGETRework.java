/**
 * 
 */
package org.apitesting;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


/**
 * @author s.m.govindarajan
 *
 */
public class TAUAPITESTINGGETRework {
	
	
	@Test
	public void getDetails()	
	{
		RestAssured.baseURI = "http://api.zippopotam.us/";

		Response res = RestAssured.given().when().get("us/90210");
		
		System.out.println(res.getStatusCode());
		
		System.out.println(res.asString());
		
		System.out.println(res.getTime());
		
		JsonPath j = new JsonPath(res.asString());
		
		System.out.println(j.get("postcode"));
		
		System.out.println(j.get("'country abbreviation'"));
		
		System.out.println(j.get("places[0].'place name'"));
		
		assertEquals(j.get("places[0].'place name'"),"Beverly Hills");
		
		assertEquals(res.contentType(),"application/json");
		
		res.then().log().body();
		
		
	}

}
