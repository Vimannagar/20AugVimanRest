package ecommerceapi;

import org.testng.annotations.Test;

import ecompojo.LoginRequest;
import ecompojo.LoginResponse;
import io.restassured.specification.RequestSpecification;
import utility.SpecBuilders;

import static io.restassured.RestAssured.*;

public class Login extends BaseTest
{
	
	
	@Test
	public void loginToApp()
	{
		LoginRequest loginrequest = new LoginRequest();
		
		loginrequest.setUserEmail("gouravjawale28@gmail.com");
		loginrequest.setUserPassword("Test@1234");
		
		
	RequestSpecification request = given()
		.header("Content-Type", "application/json")
		.spec(SpecBuilders.getRequestSpec()).body(loginrequest);
	
LoginResponse response = request
						.when()
						.post("/api/ecom/auth/login")
						.then()
						.log().all()
						.extract()
						.response()
						.as(LoginResponse.class);

		String token = response.getToken();
		System.out.println(token);
		
		BaseTest.token = token;
		
		String uid = response.getUserId();
		System.out.println(uid);
		
		userid = uid;
	
	
	}

}
