package com.bridgeLabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class binaryConver {

	public static void main(String[] args) {
		System.out.println("Enter number :");
		int Number=Utility.in.nextInt();
		int array[]=Utility.toBinary(Number);
		for(int i:array) {
			System.out.print(i+" ");
		}
	}

}
