package com.bridgelabz.fuctionalprog;

import java.util.Scanner;

public class Quadratic {
     static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		QuadraticEqu();
	}
	public static void QuadraticEqu() {
		double a,b,c;
		System.out.println("Enter First the Number ");
		a=in.nextFloat();
		System.out.println("Enter Second the Number ");
		b=in.nextFloat();
		System.out.println("Enter First the Number ");
		c=in.nextFloat();
		
		double delta=b*b-4*(a*c);
		double root1=((-b)+Math.sqrt(delta))/(2*a);
		double root2=((-b)-Math.sqrt(delta))/(2*a);
		System.out.println(root1);
		System.out.println(root2);
	}
}
