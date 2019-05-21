package com.bridgeLabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
/****************************************************************************************
 * 	@purpose:Read .a List of Numbers from a file and arrange it ascending Order in a 
 * 			Linked List. Take user input for a number, if found then pop the number 
 * 			out of the list else insert the number in appropriate position
 
 * 	
 * 	@author  :Sunil Yenare
 * 	@version : 1.0
 *	@since	 :04/05/2019
 * 
 *****************************************************************************************/
public class Ordered_list {
 @SuppressWarnings("unchecked")
public static void main(String[] args) {
	 Utilityds util=new Utilityds();
	 Scanner scan=new Scanner(System.in);
	 boolean check;
	 String address="/home/user/BinarySearchWorld/orderlist.txt";
	 String data="";

		try {
		 FileReader fr=new FileReader(address);
		BufferedReader br=new BufferedReader(fr); 
		String line=br.readLine();					//to read a whole line
		while(line != null)
		{
			data+=line;
			line=br.readLine();
		}
		br.close();
		fr.close();
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		String []obj=data.split(" ");
		   int array[] = new int[obj.length];
		   /*
		    * converting string array as integer array 
		    */
		 for(int i=0;i<obj.length;i++) {
			 array[i]=Integer.parseInt(obj[i]);
		 }
		 
		    int n=array.length;
		    System.out.println("File Input");
		   for(Object p:array) {
			   System.out.print(p+" ");
		   }
		   /*
		    * Here we are sorting the array 
		    */
		   int temp;
			for(int i=0;i<n-1;i++) {
				for(int j=i+1;j<n;j++) {
					if(array[i]>array[j]) {
						temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
			}
			System.out.println();
			System.out.println("Order Linked List ....!!!");
			
		
//		Arrays.sort(num);
		
		
		for (int i = 0; i < obj.length; i++) {
			util.ll.add(String.valueOf(array[i]));
		}
		System.out.println("the elements in the list are");
		util.ll.show();
		System.out.println("enter key to search");
		String key=scan.next();
		check=util.ll.search(key);
		
		if(check==true)
		{
		util.ll.delete(key);									//if it present it must be deleted
		util.ll.OrderedList();
		}
		else
		{
		util.ll.add(key);//if it not exist it must be added
		util.ll.OrderedList();
		}
		util.ll.show();
		

	scan.close();
		
		
 }
 
}
