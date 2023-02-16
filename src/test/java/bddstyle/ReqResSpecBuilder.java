package bddstyle;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import jsonbody.JsonString;

public class ReqResSpecBuilder {

	@Test
	public void createUser()
	{
	RequestSpecification req = new RequestSpecBuilder()
		.setBaseUri("https://petstore.swagger.io/v2")
		.setContentType(ContentType.JSON)
		.build();
	
	
	
	
		RequestSpecification request = given().spec(req).body(JsonString.getCreateUserBody());
	
			ResponseSpecification responsespec = new ResponseSpecBuilder().expectStatusCode(200)
			.expectContentType(ContentType.JSON).build();
			
			
			Response response = request.when().post("user")
			.then()
			.spec(responsespec)
			.log().all()
			.extract().response();
			
			String stringresponse = response.asPrettyString();
			
			JsonPath jp = new JsonPath(stringresponse);
			String messagevalue = jp.getString("message");
			
			System.out.println(messagevalue);
			
			
			
	
		
	}

}
