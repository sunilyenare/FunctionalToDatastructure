package com.bridgelabz.fuctionalprog;

import java.util.Scanner;

import com.bridgelabz.utility.*;
public class triplets {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Element you want...!");
		int n=in.nextInt();
		int arr1[]=new int[n];	
		for(int i=0;i<n;i++) {
			System.out.println("Enter :");
			int p=in.nextInt();
			arr1[i]=p;
			}
			Utility.triplet(arr1,arr1.length);
	}
	

}
