package com.bridgeLabz.datastructure;

import java.util.Scanner;
/********************************************************************************************
 * 
 * @purpose 	:Bank operation using queue
 * @author 		:Sunil Yenare
 * @version 	: 1.0
 * @since		: 07-05-2019
 * +-
 * 
 ********************************************************************************************/

public class Queue {
public static void main(String[] args) {
	
	Utilityds util=new Utilityds();
	int balance=0;
	int deposit;
	int wd=0;
	int ch;
	int n=0;
	int people=0;
	Scanner scan=new Scanner(System.in);
	
	System.out.println("--------------Welcome to Bank--------------");
	System.out.println("Enter no of people in queue");
	n=scan.nextInt();
	while(n>0)
	{
		
	System.out.println("Enter 1 to Deposit 0 to Withdraw");
	ch=scan.nextInt();
	switch(ch)
	{
	case 1:
			System.out.println("Enter the Deposit Amount");
			deposit=scan.nextInt();
			balance+=deposit;
			util.queue.enqueue(people++);
			System.out.println("The Amount in bank is "+balance);
			n--;
			break;
	case 0:System.out.println("Enter Amount to Withdraw ");
			wd=scan.nextInt();
			balance-=wd;
			util.queue.dequeue();
			n--;
			System.out.println("The Amount in Bank is "+balance);
			break;
	default:System.out.println("Enter valid Number");
	
	}
	
	
	}
}
}
