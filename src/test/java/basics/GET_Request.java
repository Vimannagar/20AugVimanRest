package basics;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_Request {
	
	
	
	@Test
	public void getListUsers()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
      	RequestSpecification httprequest = RestAssured.given();   
		
		Response response = httprequest.request(Method.GET, "/api/users?page=2");
		
	String resp = response.asPrettyString();
		
		System.out.println(resp);
		
		int statuscode = response.statusCode();
		
		System.out.println(statuscode);
		
		Assert.assertEquals(statuscode, 400);
		
	}
	

	@Test
	public void getSingleUser()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
      	RequestSpecification httprequest = RestAssured.given();   
		
		Response response = httprequest.request(Method.GET, "/api/users/2");
		
	String resp = response.asPrettyString();
		
		System.out.println(resp);
		
		int statuscode = response.statusCode();
		
		System.out.println(statuscode);
		
	
		
	}


}
