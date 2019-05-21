package com.bridgeLabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.*;
public class SortSearchMenu {
	
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		
	System.out.println("Here IS The Above Menu Option ");
	System.out.println();
	System.out.println("Press 1 For Insertion sort For String Array..!!");
	System.out.println("Press 2 For Insertion sort For Integer Array..!!");
	System.out.println("Press 3 For Bubble-Sort For String Array..!!");
	System.out.println("Press 4 For Bubble-Sort For Integer Array..!!");
	System.out.println("Press 5 For Binary-Search For String Array..!!");
	System.out.println("Press 6 For Binary-Search For Integer Array..!!\n");
		
			System.out.println("Enter Number Here : ");
			int n=in.nextInt();
			switch (n) {
			case 1:
				Utility.insertionSort();
				
				break;
			case 2:Utility.insertionIntSort();
				break;
			case 3:Utility.bubbleSort();
				break;
			case 4:Utility.bubbleIntSort();
				break;
			case 5:Utility.binarySearch();
				break;
			case 6:Utility.binaryIntSearch();
				break;
			default:System.out.println("SWITCH END...!!! ");
				break;
			}
	}
	
	
}
