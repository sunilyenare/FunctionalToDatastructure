package com.bridgelabz.fuctionalprog;

import java.util.Scanner;

import com.bridgelabz.utility.*;
public class LeapYear {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Please Enter a Year : ");
		int year=in.nextInt();
		int len=String.valueOf(year).length();
		if(len<4) {
			System.out.println("please enter valid number \n number should be 4 digit ");
			
		}else {
			Utility.leap(year);
		}
		
		
	}
	

}
