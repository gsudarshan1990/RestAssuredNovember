/**
 * 
 */
package org.apitesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

/**
 * @author s.m.govindarajan
 * 
 * This is Request and Response Specification Example
 *
 */
public class TAUAutomationSpecification {
	
	
	@Test
	public void RequestSpecificationExample()
	{
		RequestSpecBuilder resspecbuild = new RequestSpecBuilder();
		
		RequestSpecification reqspec = resspecbuild.setBaseUri("http://api.zippopotam.us/").build();
		
		ResponseSpecBuilder responsespecbuild = new ResponseSpecBuilder();
		
		ResponseSpecification responsespec  = responsespecbuild.build();
		
		RestAssured.baseURI = "http://api.zippopotam.us/";
		
		Response res = RestAssured.given().pathParam("countrycode", "us").pathParam("zipcode", "90210").spec(reqspec).when().get("{countrycode}/{zipcode}");
		
		res.then().spec(responsespec).log().all();
		
		
		
	}

}
