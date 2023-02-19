package ecommerceapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class PlaceOrder extends BaseTest{
	
	
	@Test
	public void placeUserOrder()
	{
		RestAssured.baseURI = "https://www.rahulshettyacademy.com";
		
		given().header("Authorization", token)
		.header("Content-Type", "application/json")
		.log().all()
		.body(JsonString.getBodyPlaceOrder(productid))
		.when()
		.post("/api/ecom/order/create-order")
		.then()
		.log().all()
		.extract()
		.response();
		
		
	}

}
