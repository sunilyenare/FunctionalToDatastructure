package com.bridgeLabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.*;
public class VendingMachine {
	
	public static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		int slot[]= { 2000 , 1000 , 500 , 200 , 100 , 50, 20 , 10 , 5 , 2 ,1};
		
		Utility.Account(slot,slot.length);
		
	}
	
}