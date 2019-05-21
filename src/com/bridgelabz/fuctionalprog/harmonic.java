package com.bridgelabz.fuctionalprog;

import java.util.Scanner;

import com.bridgelabz.utility.*;

public class harmonic {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("please enter number");
		int p=in.nextInt();
		if(p!=0)
		Utility.harmo(p);
	}
	

}
