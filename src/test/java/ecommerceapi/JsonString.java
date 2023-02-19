package ecommerceapi;

public class JsonString {
	
	
	public static String getBodyPlaceOrder(String prdid)
	{
		String s = "{\"orders\": [\r\n"
				+ "        {\r\n"
				+ "        \"country\": \"India\", \r\n"
				+ "        \"productOrderedId\" : \""+prdid+"\"\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";
		
		return s;
	}

}
