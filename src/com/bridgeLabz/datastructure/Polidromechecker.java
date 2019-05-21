package com.bridgeLabz.datastructure;

import java.util.Scanner;

/****************************************************************************************
 * 	@purpose:A palindrome is a string that reads the same forward and backward, 
 * 		for example, radar, toot, and madam. We would like to construct an algorithm to i
 * 		nput a string of characters and check whether it is a palindrome.
 * 	
 * 	@author  :Sunil Yenare
 * 	@version : 1.0
 *	@since	 :07/05/2019
 * 
 *****************************************************************************************/
	

public class Polidromechecker {
	public static void main(String[] args) {
		
		Utilityds util=new Utilityds();			//creating utility class object
		Scanner scan=new Scanner(System.in);	//to scan input data
		System.out.println("Enter the String....!!!");
		String input=scan.next();		
		char[] data=input.toCharArray();		//variable for convertion from string to charecters
		
		for (int i = 0; i < data.length; i++) { 	//loop to add the data to deque
			util.deq.addrear(data[i]);
		}
			util.deq.print();
			boolean check=util.deq.polindrome();	//to check wether the given string is polindrome or not
			if(check==true)
			{
				System.out.println(" String is Polindrome");
			}else
			{
				System.out.println(" String is Not Polindrome");
			}
			scan.close();
	}
}
