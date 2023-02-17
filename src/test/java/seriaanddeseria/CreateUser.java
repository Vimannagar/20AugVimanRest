package seriaanddeseria;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pojo.ReqBody;
import pojo.ResBody;

public class CreateUser {
	
	@Test
	public void createUserAPI()
	{
		ReqBody rb = new ReqBody();
		rb.setEmail("abcdef@gmail.com");
		rb.setFirstname("Eder");
		rb.setLastName("Mejia");
		rb.setId(0);
		rb.setPassword("Test@12345");
		rb.setPhone("9988775566");
		rb.setUsername("abcusertwo");
		rb.setUserStatus(0);
				
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
			ResBody resbody = given()
					.header("Content-Type", "application/json")
					.body(rb)
					.log().all()
					
					.when()
					
					.post("user")
					
					.then()
					
					.log().all()
					
					.extract()
					
					.response().as(ResBody.class);
					
			
			Integer statuscode = resbody.getCode();
			System.out.println(statuscode);
			
			String message = resbody.getMessage();
			System.out.println("Message value from response is : "+message);
					
				 
				
				 
				 
		
		
		
		
	}

}
