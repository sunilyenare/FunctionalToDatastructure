package com.bridgeLabz.algorithmprograms;

import com.bridgelabz.utility.*;
public class DayOfWeek {

	public static void main(String[] args) {
		
		int d, m, y;
		System.out.println("Enter date in day month year");
		System.out.println();
		System.out.println("Enter Day : ");
		d = Utility.in.nextInt();
		System.out.println("Enter Month : ");
		m = Utility.in.nextInt();
		System.out.println("Enter Year : ");
		y = Utility.in.nextInt();
		Utility.dayOfWeek(d,m,y);
	}


}
