package utility;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class SpecBuilders {
	
	public static RequestSpecification getRequestSpec()
	{
	RequestSpecification reqspec = new RequestSpecBuilder()
		.setBaseUri("https://www.rahulshettyacademy.com").build();
	
	return reqspec;
	}

}
