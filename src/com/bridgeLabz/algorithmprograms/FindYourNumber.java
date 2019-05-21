package com.bridgeLabz.algorithmprograms;
import com.bridgelabz.utility.*;
public class FindYourNumber {

	public static void main(String[] args) {
		System.out.println("Enter the  N Range :");
		int number=Utility.in.nextInt();
		int l=0;
		int mid=0;
		System.out.println("Enter The Number What In You Mind Up To "+number+" .......!!!!");
		mid=(l+number)/2;
		Utility.binarySearch(l,number,mid);
	}

}
