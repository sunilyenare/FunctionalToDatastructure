package com.bridgeLabz.datastructure;

import java.util.Scanner;
/********************************************************************************************
 * 
 * @purpose 	:Simple Balanced Parentheses
 * @author 		:Sunil Yenare
 * @version 	: 1.0
 * @since		: 06-05-2019
 * 
 ********************************************************************************************/

public class Balanced_paranthisis {
	public static void main(String[] args) {
		
		Utilityds util=new Utilityds();
		Scanner scan=new Scanner(System.in);
		char search;
		System.out.println("Enter the Expression...!!!");
		String input=scan.next();
		for (int i = 0; i < input.length(); i++) {
			search = input.charAt(i);// picking one on one element
			if (search == '(' || search == '[' || search == '{') 
			{
				util.stack.push(search);// pushing the element to stack object
			} else if (search == ')' || search == ']' || search == '}') 
			{
				util.stack.pop();// removing the element from stack object
			}
		}
		if(util.stack.isEmpty()==true)
		{
			System.out.println("the expression is having a balanced parentheses");
		}else
		{
			System.out.println("the expression is not having a balanced parentheses");
		}
		scan.close();
	}

}
