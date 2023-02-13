package bddstyle;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import jsonbody.JsonString;

import static io.restassured.RestAssured.*;

public class MultiAPIValidation {
	
	@Test
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
 
 
	
	
		
		
		
	}

}
