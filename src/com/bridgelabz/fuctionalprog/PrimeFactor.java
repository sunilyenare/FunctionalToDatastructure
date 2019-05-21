package com.bridgelabz.fuctionalprog;

import java.util.Scanner;

public class PrimeFactor {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		
		primeFactor();
	}
	public static void primeFactor() {
		System.out.println("Enter Number");
		int n=in.nextInt();
		int number=n;
		
		for(int i=2;i<=number;i++) {
			
			while(number%i==0) {
				System.out.print(i+"*");
				number=number/i;
			}
		}
	}

}
