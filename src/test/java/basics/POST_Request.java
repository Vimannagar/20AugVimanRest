package basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_Request {
	
	
	
	@Test
	public void createUser()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
      	RequestSpecification httprequest = RestAssured.given();
      	
      	httprequest.header("Content-Type", "application/json");
      	
      	httprequest.body("{\r\n"
      			+ "    \"name\": \"Vimannagar\",\r\n"
      			+ "    \"job\": \"Pune\"\r\n"
      			+ "}");
      	
      	Response response = httprequest.request(Method.POST, "/api/users");
      	
     String responseOfPostRequest =	response.asPrettyString();
     
     int code = response.statusCode();
     
     System.out.println(code);
     
     System.out.println(responseOfPostRequest);
     
	}

}
