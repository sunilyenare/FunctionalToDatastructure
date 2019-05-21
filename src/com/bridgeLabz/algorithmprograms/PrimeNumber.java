package com.bridgeLabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in) ;
		System.out.println("Enter The Number: ");
		int p=in.nextInt();
		Utility.primeNumber(p);
	}
	
}
