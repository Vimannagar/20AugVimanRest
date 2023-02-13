package basics;

import java.net.http.HttpRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetPetStoreInventory {
	
	
	@Test
	public void getInventory()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		RequestSpecification httprequest = RestAssured.given();
		
		Response response = httprequest.request(Method.GET, "/store/inventory");
		
		
		String responseString = response.asPrettyString();
		
		System.out.println(responseString);
		
		long totalresponsetime = response.getTime();
		
		System.out.println(totalresponsetime);
		
		 String soldvalue = response.jsonPath().getString("availabl");
		 
		 System.out.println("Value corresponding to sold is :"+soldvalue);
		
		
		
	}

}
