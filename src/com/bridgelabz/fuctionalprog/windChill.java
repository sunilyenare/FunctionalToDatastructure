package com.bridgelabz.fuctionalprog;

import java.util.Scanner;

public class windChill {
  static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
	
		wind();
	}
	public static void  wind() {
		System.out.println("Enter the tempreture...!!");
		double t=in.nextInt();
		System.out.println("Enter the WindSpeed...!!");
		double v=in.nextInt();
		
		if(t<=50 && (v<=120&&v>3)) {
			
			double windchill=35.74+0.62151*t+((0.4275*t)+35.75)*(Math.pow(v, 0.16));
			System.out.println("WindChill is="+windchill);
		}else {
			System.out.println("Enter t in between 1-50 or v in between 3-120");
		}
	}
}
