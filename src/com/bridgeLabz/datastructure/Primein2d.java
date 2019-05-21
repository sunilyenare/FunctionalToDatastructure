package com.bridgeLabz.datastructure;



/****************************************************************************************
 * 	@purpose:Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. 
 * 			 Store the prime numbers in a 2D Array
 * 	
 * 	@author  :Sunil Yenare
 * 	@version : 1.0
 *	@since	 :07/05/2019
 * 
 *****************************************************************************************/

public class Primein2d {
	
		
		public static void main(String[] args) {
			Utilityds util=new Utilityds();
			
			
			int[] arr1=util.prime();
			
			int[][] arr2=new int[10][167];
			
			System.out.println("the prime in 2D array ");

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 167; j++) {
					if (arr1[j] > ((i) * 100) && arr1[j] < ((i + 1) * 100)) {
					{
						arr2[i][j]=arr1[j];
					System.out.print(arr2[i][j]+" ");
						
					}
					
					}
				}System.out.println();

			}
			System.out.println("the anagrams are ");
			int[] anag=util.checkanagaram(arr1);
			for (int i = 0; i < anag.length; i++) {
				System.out.print(anag[i]+" ");
			}
		}
	}


