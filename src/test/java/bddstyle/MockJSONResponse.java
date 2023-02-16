package bddstyle;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import jsonbody.JsonString;

public class MockJSONResponse {
	
	@Test(priority = 1)
	public void getPurchaseAmount()
	{
	JsonPath jp = new JsonPath(JsonString.mockjson());
		
	int	purchaseamount = jp.getInt("dashboard.purchaseAmount");
	
	System.out.println(purchaseamount);//910
	
	Object website = jp.get("dashboard.website");
	
	System.out.println(website);//www.google.com
	
	}
	
	@Test(priority = 2)
	public void getCourseCount()
	{
		JsonPath jp = new JsonPath(JsonString.mockjson());
		
		int totalnumberofcourse = jp.getInt("courses.size()");
		
		System.out.println(totalnumberofcourse);//3
		
		
	}
	
	@Test(priority = 3)
	public void getTitleOfAllCourses()
	{
		JsonPath jp = new JsonPath(JsonString.mockjson());
		
		int count = jp.getInt("courses.size()");
		
//		String titleoffirstcourse= jp.getString("courses[0].title");
//		System.out.println(titleoffirstcourse);
		
		for(int i=0; i<count; i++)
		{
			String coursetitle = jp.getString("courses["+i+"].title");
			
			
			String price = jp.getString("courses["+i+"].price");
			
			System.out.println(coursetitle+" " +price);
		}
	}
	
	
	
	@Test
	public void validatePrice()
	{
		
		int sum = 0;
		JsonPath jp = new JsonPath(JsonString.mockjson());
		
		int coursecount = jp.getInt("courses.size()");
		
		for(int i=0; i<coursecount; i++)
		{
			int price = jp.getInt("courses["+i+"].price");
			
			int copies = jp.getInt("courses["+i+"].copies");
			
			sum = sum+ price*copies;
		}
		
		int totalprice = jp.getInt("dashboard.purchaseAmount");
		
		
		Assert.assertEquals(sum, totalprice);
		
	}
	


}
