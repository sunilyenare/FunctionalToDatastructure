package com.bridgelabz.fuctionalprog;

import java.util.Scanner;

public class couponPRo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of coupons");
		int n=scan.nextInt();  //input to program
        boolean[] isCollected = new boolean[n];  
        int count = 0;       // to count the exe of rand fun                    
        
        int distinct = 0;    //  to keep trace of distinct coupon                   
  
 
        while (distinct < n) {
        		int value = (int) (Math.random() * n);
        		count++;   
        		//System.out.println("value "+value);
        		if (!isCollected[value]) {
        			System.out.println("call"+value);
        			distinct++;
        			isCollected[value] = true;
//        			System.out.println(value+" ");
        		}
        		
        }
        System.out.println("Count "+count);
	}

}
