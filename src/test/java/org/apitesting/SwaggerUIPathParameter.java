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
public class SwaggerUIPathParameter {
	
	@Test
	public void SwaggerUIPathParameter()
	{
		RestAssured.baseURI =  "https://petstore.swagger.io/v2/";
		
		Response res = RestAssured.given().pathParam("petid", 10).when().get("pet/{petid}");
		
		res.then().log().body();
		
		Response resSecond = RestAssured.given().pathParam("orderId", 3).when().get("store/order/{orderId}");
		
		resSecond.then().log().body();
		
		Response resthird = RestAssured.given().pathParam("orderId",10).when().delete("store/order/{orderId}");
		
		resthird.then().log().body();
		
		
	}

}
