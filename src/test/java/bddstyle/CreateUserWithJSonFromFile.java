package bddstyle;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class CreateUserWithJSonFromFile {
	
	
	@Test(priority = 1)
	public void createUser() throws IOException
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
String response= given()
	.header("Content-Type", "application/json")
	.body(new String(Files.readAllBytes(Paths.get("F:\\Desktop\\VimanNagar\\May 21\\20AugustVimanRestAssured\\JSONPayload.txt"))))
	.log().all()
	
	.when()
	
	.post("user")
	
	.then()
	
	.log().all()
	.extract()
	.response().asPrettyString();
	
	
//		1. paste the json directly inside the body method.
//		2. Maintain a method which returns the String which is nothing but a json
//		3. Keep the JSON in the form of txt file.
//		4. Send the data by using Serialization and retrieve it by Deserialization

 
 
 	
	}

}
