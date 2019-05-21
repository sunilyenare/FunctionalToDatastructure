package com.bridgelabz.fuctionalprog;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoD_Array {
	
	static Scanner in=new Scanner(System.in);
	static PrintWriter pw=new PrintWriter(System.out);
	public static void main(String...arg) {
			System.out.println("Enter the  row and column");
			int row =in.nextInt();
			int col=in.nextInt();
			Object [][]input=new Object[row][col];
			System.out.println("Insert Data");
			
			for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++) {
							input[i][j]=in.nextLine();
					}
			}
			
			for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++) {
							pw.print(input[i][j]+" ");
							pw.flush();
					}System.out.println();
	}
}

}
