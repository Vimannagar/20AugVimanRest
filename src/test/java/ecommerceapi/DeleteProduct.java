package ecommerceapi;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class DeleteProduct extends BaseTest {
	
	
	@Test
	public void validateDeleteProduct()
	{
RestAssured.baseURI = "https://www.rahulshettyacademy.com";
		
String response	=	given()
		.header("Authorization", token)
		.header("Content-Type", "application/json")
		.pathParam("productId", productid)
		.log().all()
		.when()
		.delete("/api/ecom/product/delete-product/{productId}")
		.then()
		.log().all()
		.extract()
		.response()
		.asPrettyString();
		

System.out.println(response);
		
	}

}
