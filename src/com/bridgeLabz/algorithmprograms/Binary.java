package com.bridgeLabz.algorithmprograms;
import com.bridgelabz.utility.*;
public class Binary {

	public static void main(String[] args) {
		try {
			int power=0;
			int count=0;
			System.out.println("Enter number :");
			int Number=Utility.in.nextInt();
			//utility fuction calling 
			int array[]=Utility.toBinary(Number);
			int arr[]=Utility.swapNibble(array);
			System.out.println("Find the resultant number is the number in a power of 2 = ");
			for(int i=arr.length-1;i>=0;i--) {
				if(arr[i]==1) {
					System.out.println();
					power=(int)Math.pow(2,count);
					System.out.println("2^"+count+"="+power);
				}
				count++;
			}
			System.out.println();
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
