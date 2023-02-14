package jsonbody;

public class JsonString {
	
	
	public static String getCreateUserBody()
	{
		
		return "{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"username\": \"userfive\",\r\n"
				+ "  \"firstName\": \"ufive\",\r\n"
				+ "  \"lastName\": \"lfive\",\r\n"
				+ "  \"email\": \"ufive.lfive@a.com\",\r\n"
				+ "  \"password\": \"Rest@1234\",\r\n"
				+ "  \"phone\": \"7878787882\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}";
	}
	
	
	
	public static String mockjson()
	{
		return "{\r\n"
				+ "\r\n"
				+ "\"dashboard\": {\r\n"
				+ "\r\n"
				+ "\"purchaseAmount\": 910,\r\n"
				+ "\r\n"
				+ "\"website\": \"www.google.com\"\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "\"courses\": [\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Selenium webdriver java\",\r\n"
				+ "\r\n"
				+ "\"price\": 50,\r\n"
				+ "\r\n"
				+ "\"copies\": 6\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Cypress\",\r\n"
				+ "\r\n"
				+ "\"price\": 40,\r\n"
				+ "\r\n"
				+ "\"copies\": 4\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Protractor\",\r\n"
				+ "\r\n"
				+ "\"price\": 45,\r\n"
				+ "\r\n"
				+ "\"copies\": 10\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "]\r\n"
				+ "\r\n"
				+ "}";
	}

}
