package com.bridgeLabz.datastructure;

public class PrimeAnagra {

	public static void main(String[] args) {
		
		Utilityds util=new Utilityds();
		
		int[] arr3=util.prime();
		
		int[][] arr2=new int[10][167];
		int[] arr1=util.checkanagaram(arr3);
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
		
	}

}
