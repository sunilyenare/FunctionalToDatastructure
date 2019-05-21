/********************************************************************************************
 * 
 * @purpose 	:Hashing Function to search a Number in a slot
 * @author 		:Sunil Yenare
 * @version 	: 1.0
 * @since		: 08-05-2019
 * 
 ********************************************************************************************/

package com.bridgeLabz.datastructure;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgeLabz.datastructure.Utilityds.linkedlist;



public class HashingProg {
	@SuppressWarnings("unchecked")
	public static linkedlist slot[] = new linkedlist[11];

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws FileNotFoundException {
		String path = "/home/user/BinarySearchWorld/file1.txt";

		for (int i = 0; i < 11; i++) {
			slot[i] = new linkedlist();
		}

		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			String str = br.readLine();

			String[] strAr = str.split(",");			
			   int array[] = new int[strAr.length];
			   /*
			    * converting string array as integer array 
			    */
			 for(int i=0;i<strAr.length;i++) {
				 array[i]=Integer.parseInt(strAr[i]);
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
				System.out.println("Order  List ....!!!");
				System.out.println("Size is : "+slot.length);
				
				for(Object p:array) {
					   System.out.print(p+" ");
				   }
				System.out.println();
		
				for (int i = 0; i < array.length-1; i++) {
					int slotNum = hash(array[i]);
					slot[slotNum].add(array[i]);
				
				}		

			for (int i = 0; i < 12; i++) {
				System.out.print(i + "==> ");
				slot[i].show();

			}
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Integer to search:");
			int key = sc.nextInt();
			int slotNumber = hash(key);
			boolean value = slot[slotNumber].search(key);
			if (value) {
				System.out.println("\nElement found at slot " + slotNumber + " and deleted\n");
				slot[slotNumber].delete(key);
			} else {
				System.out.println("\nElement not found but added: " + key + " at slot " + slotNumber + "\n");
				slot[slotNumber].add(key);
			}

			System.out.println();
			for (int i = 0; i < 11; i++) {
				System.out.print(i + "==> ");
				slot[i].show();
			}

			String st = " ";
			for (int i = 0; i < 11; i++) {
				st = st + slot[i].toString();
			}
			System.out.println("New elements in file:\n" + st);
			BufferedWriter bw = new BufferedWriter(new FileWriter(path));
			bw.write(st);

			bw.close();
			br.close();
			sc.close();
		} catch (IOException e) {
			System.out.println("" + e.getMessage());
			e.printStackTrace();
		}
	}

	public static int hash(int str) {
		int index = str % 11;

		return index;
	}
}
