package ecommerceapi;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class AddProduct extends BaseTest{
	
	@Test
	public void addProduct()
	{
		RequestSpecification reqspec = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
		.addHeader("Authorization", token).build();
		
		
		RequestSpecification request = given()
							.spec(reqspec)
							.log().all()
							.param("productName", "Fancy Jeans")
							.param("productAddedBy", userid)
							.param("productCategory", "fashion")
							.param("productSubCategory", "shirts")
							.param("productPrice", "1000")
							.param("productDescription", "Spykar")
							.param("productFor", "women")
							.multiPart("productImage", new File("F:\\Desktop\\VimanNagar\\May 21\\20AugustVimanRestAssured\\Test product image.png"));
		
		
		String response = request.when()
				.post("/api/ecom/product/add-product")
				.then()
				.log().all()
				.extract()
				.response()
				.asPrettyString();
		
		JsonPath jp = new JsonPath(response);
		
		productid = jp.getString("productId");
		System.out.println("Product id is : "+productid);
				
		
		
	}

}
