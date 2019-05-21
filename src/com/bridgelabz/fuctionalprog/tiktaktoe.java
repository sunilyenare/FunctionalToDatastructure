package com.bridgelabz.fuctionalprog;

import com.bridgelabz.utility.*;
public class tiktaktoe {
    static char board1[][]=new char[3][3];	
	
	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				board1[i][j]='_';
			}
		}
		Utility.play(board1);
	}
	
	
}
