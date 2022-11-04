/**
 * 
 */
package org.apitesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/**
 * @author s.m.govindarajan
 *
 */
public class TAUAPITESTINGPATHPARAMETER {
	
	
	@Test
	public void pathParameterExample()
	{
		
		RestAssured.baseURI = "http://api.zippopotam.us/";
		
		Response res =RestAssured.given().pathParam("countrycode", "us").pathParam("zipcode", "90210").when().get("{countrycode}/{zipcode}");
		
		System.out.println(res.getStatusCode());
		
		System.out.println(res.asString());
		
		System.out.println(res.getTime());
		
		Assert.assertEquals(res.getStatusCode(), 200);
		
		JsonPath jp = new JsonPath(res.asString());
		
		Assert.assertEquals(jp.get("'post code'"), "90210");
		
		Assert.assertEquals(jp.get("country"), "United States");
		
		Assert.assertEquals(jp.get("places[0].'state'"), "California");
		
		res.then().log().body();
		
		
		
	}

}
