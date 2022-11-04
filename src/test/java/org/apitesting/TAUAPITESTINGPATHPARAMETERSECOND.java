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
public class TAUAPITESTINGPATHPARAMETERSECOND {

	@Test
	public void getDetailsViaPathParameter()
	{
		RestAssured.baseURI = "http://api.zippopotam.us/";
		
		Response res = RestAssured.given().pathParam("countrycode", "ca").pathParam("zipcode", "B2R").when().get("{countrycode}/{zipcode}");
		
		
		res.then().log().body();
		
		System.out.println(res.getStatusCode());
		
		System.out.println(res.getContentType());
		
		System.out.println(res.getTime());
		
		System.out.println(res.asString());
		
		JsonPath jp = new JsonPath(res.asString());
		
		Assert.assertEquals(jp.get("'post code'"),"B2R");
		
		Assert.assertEquals(jp.get("country"),"Canada");
		
		Assert.assertEquals(jp.get("places[0].'state'"), "Nova Scotia");
		
	}
	
}
