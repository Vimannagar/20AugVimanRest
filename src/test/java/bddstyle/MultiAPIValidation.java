package bddstyle;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import jsonbody.JsonString;

import static io.restassured.RestAssured.*;

public class MultiAPIValidation {
	static String message;
	
	
	@Test(priority = 1)
	public void createUser()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
 String response = given()
	.header("Content-Type", "application/json")
	.body(JsonString.getCreateUserBody())
	.log().all()
	
	.when()
	
	.post("user")
	
	.then()
	
	.log().all()
	
	.extract()
	
	.response()
	
	.asPrettyString();
 
 JsonPath jp = new JsonPath(response);
 
  message = jp.getString("message");
 
 System.out.println("Message value is "+message);
 
 	
	}
	
	
	@Test(priority = 2)
	public void getUserDetails()
	{
		
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		String response = given().header("Content-Type", "application/json")
		.when()
		.get("user/userfive")
		.then()
		.log().all()
		.extract()
		.response()
		.asPrettyString();
		
		
		JsonPath jp = new JsonPath(response);
		
		String idvalue = jp.getString("id");
		
		System.out.println("id value is :"+idvalue);
		
		
		Assert.assertEquals(idvalue, message);
		
		
		
		
		
	}
	
	
	

}
