package com.bridgelabz.fuctionalprog;

import java.util.Scanner;

public class replacestring {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter User-Name");
		String user=in.nextLine().toUpperCase();
		if(user.length()<3) {
			System.out.println("Please enter mini 3 character");
		}else {
			System.out.println("Hello "+user+", How are you?" );
		}
	}

}
