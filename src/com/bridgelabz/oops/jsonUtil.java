package com.bridgelabz.oops;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class jsonUtil {

	private static ObjectMapper mapper;
	
	 static {
		 mapper=new ObjectMapper();
	 }
	
	public static String convertJavatoJson(Object obj) {
		String stringResult="";
			try {
				stringResult=mapper.writeValueAsString(obj);
			} catch (JsonGenerationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return stringResult;
	}

	
}
