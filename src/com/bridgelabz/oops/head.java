package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


@SuppressWarnings("unused")
public class head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo dm=new demo();
		dm.setCode("#lop");
		dm.setColor("red");
		dm.setName("Xem");
		
		String result=jsonUtil.convertJavatoJson(dm);
		System.out.println(result);
	}

}
