package com.bridgelabz.fuctionalprog;

import java.util.Scanner;

import com.bridgelabz.utility.*;
public class gambler {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
	
	System.out.println("Enter The Stack how much you want to play..!!");
	int stack=in.nextInt();
	System.out.println("Enter the Goal How much You Want to Win..!!");
	int goal=in.nextInt();
	System.out.println("Enter number of Bet you want to play ");
	int bet=in.nextInt();
	
	Utility.startHere(stack,goal,bet);
	

	}
	
}
