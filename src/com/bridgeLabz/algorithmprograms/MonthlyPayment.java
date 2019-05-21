package com.bridgeLabz.algorithmprograms;
import com.bridgelabz.utility.*;
public class MonthlyPayment {

	public static void main(String[] args) {
	
		System.out.println("Here is Your Solution to Calculate Your EMI....!!!!");
		System.out.println("Enter The Principal Amount... ");
		double p =Utility.in.nextDouble();
		System.out.println("Enter Year... ");
		double y = Utility.in.nextDouble();
		System.out.println("Enter Rate... ");
		double r = Utility.in.nextDouble();
	
		System.out.println("mothly payment is " + Utility.monthlyPayment(p, y, r));

	}

}
