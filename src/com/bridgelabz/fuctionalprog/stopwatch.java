package com.bridgelabz.fuctionalprog;

import java.util.Scanner;

public class stopwatch {
	static long starttime;
	static long stoptime;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		stopwatch sw=new stopwatch();
		System.out.println("enter 1 to start the time");
		scan.nextInt();
		starttime=starttime();
		System.out.println("enter 2 to stop the time");
		scan.nextInt();
		stoptime=stoptime();
		scan.close();
		System.out.println("elapsed time is");
		System.out.println((sw.stoptime-sw.starttime)/1000);
	}
	public static long starttime()							//to start a time 
	{
		
		return System.currentTimeMillis();
	}
	public static long stoptime()							//to stop the time
	{
		
		return System.currentTimeMillis();
	}
}
