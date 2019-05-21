package com.bridgeLabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.*;
public class TemperaturConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("enter temp in c or f");
			int tem = s.nextInt();
			char t = s.next().charAt(0);
			s.close();
			if (t != 'f' && t != 'F' && t != 'c' && t != 'C') 
			{
				System.out.println("enter correct input");
				return;
			}
			tem = Utility.temperaturConversion(tem, t);
			System.out.println("coverted temp is " + tem);
		} 
		catch (Exception e) 
		{
			System.out.println("temperature in format (45 c) or (32 f) :");
		}
			
			
	}

}
