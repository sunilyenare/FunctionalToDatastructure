package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utility {
	public static Scanner in=new Scanner(System.in);
/*
 * FUCTIONL PROGRAMMING START FROM HERE...!!!
 */
	
	/*
	 * HERE WE ARE FINDING NUMBER IS LEAP YEAR OR NOT..?
	 */
	public static void leap(int y) {
		if(y%100==0) {
			if(y%400==0) {
				System.out.println(y+" ,is a Leap Year");
			}else {
				System.out.println(y+",Not Leap Year");
			}
		}else if(y%4==0) {
			System.out.println(y+" ,is a leap Year");
		}else {
			System.out.println(y+" is not a leap Year");
		}
	}
	
	

//*************************************************************************
		/*
		 * FINDING HARMONIC NUMBER...!!!
		 */
	public static void harmo(int n) {
		double sum=0;
		for(int i=1;i<n;i++) {
			sum+=1.0/i;
		}
		System.out.println(sum);
	}
	
//*************************************************************************
	/*
	 * FIND THE TRIPLETS
	 */
	public static void triplet(int arr[],int n) {
		int c=0;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
						c++;
					}
				}
			}
		}
		System.out.println("Total Triplet Opration : "+c);
	}
//*************************************************************************
	/*
	 * WRITE PROGRAME FOR PLAYING GAMBEL
	 */
	public static void startHere(int money,int goal1,int bet1) {
		int win=0;
		int count=bet1;
		for(int i=0;i<bet1&&money>0&&goal1>money;i++) {
			System.out.println("Enter Dice Number what you want to bet On...!!!\n Remember there is only 6 side of dice..!!");
			int dice=in.nextInt();
					if(dice>0&&dice<7) {
						if(play(dice)) {
							money+=5;
							win++;
							if(i==bet1) {
								System.out.println("Now You have"+money+"With you");
							}
							if(money==goal1) {
								System.out.println("You are such a Gambler Guy");
							}
							if(money==0) {
								System.out.println("You dont have enough money to play...!");
							}
							if(money>10) {
								System.out.println("Still you have RS"+money+"  To play..!!");
							}
							count--;
							System.out.println("YOu have more "+count+" rounds ");
							
						}else {
							money-=1;
							
							count--;
							System.out.println("YOu have more "+count+" rounds ");
						}
					}else {
						System.out.println("try again...!!!");
						startHere(money, goal1, bet1);
					}
		}
		System.out.println(" This many time you won this Game : "+win);
		System.out.println(" This many time you lose this Game : "+(bet1-win));
		System.out.println("Your Account is RS "+money);
	}
		public static boolean play(int n) {
			int random=(int)(Math.random()*5.0+1.0);
			if(n==random) {
				System.out.println("congrat's you got this..!!");
				return true;
			}else {
				System.out.println("Not Lucky... try next time...!!!");
				return false;
			}
		
		}
//*************************************************************************
		/*
		 * WRITE CODE FOR TIKTAKTOE GAME..!!!
		 */
		static int row,col;
	    static char turn='X';
			
		
		public static void  play(char board[][]) {
			
			boolean playing= true;
		
			while(playing) {
				System.out.println("Enter row & column position where you want to play...?");
				row=in.nextInt()-1;
				col=in.nextInt()-1;
					if((row>=0&&row<=2)&&(col>=0&&col<=2)) {

						board[row][col]=turn;
						printBoard(board);
						if(GameOver(row, col,board))
						{
							playing=false;
							System.out.println("!!!...Player "+turn+" Winner Winner Chicken Diner...!!!");
						}
						
						if(turn=='X')
						{
							turn='O';
						}else {
							turn='X';
						}
				
					}else {
						System.out.println("Please Enter Number between 1 to 3...!");
						play(board);
					}
			}
		}
		public static void printBoard(char board[][]) {
			for(int i=0;i<3;i++) {
				System.out.println();
				System.out.print("| ");
				for(int j=0;j<3;j++) {
					System.out.print(board[i][j]+" | ");
				}
			}
			System.out.println();
		}
		public static boolean GameOver(int r,int c,char board[][]) {
			if(board[0][c]==board[1][c]&&board[0][c]==board[2][c])
				return true;
			if(board[r][0]==board[r][1]&&board[r][0]==board[r][2])
				return true;
			if(board[0][0]==board[1][1]&&board[0][0]==board[2][2]&&board[1][1]!='_')
				return true;
			if(board[0][2]==board[1][1]&&board[0][2]==board[2][0]&&board[1][1]!='_')
				return true;
			return false;
		}


//******************************************************************************************
		/*
		 * WAP to FLIPCOIN
		 */
		public static void percentage()
		{
			System.out.println("How many Time you wanted to flip coin..?");
				int flip=in.nextInt();
				int tails=0;
				int head=0;
			for(int i=0;i<flip;i++) {
					double num=Math.random();
				if(num<0.5) 
				{
					tails++;
				}else {
					head++;
				}
			}
			
			float tper=tails*100/flip;
			float hper=head*100/flip;
			System.out.println(" percentage of Heads is "+hper+"%"+"\n percentage of Tails is "+tper+"%");
			
			
		}
//*******************************************************************************************
		/*
		 * WAP TO FIND TABLE OF 2 POWER
		 */
		
		public static void TwoPower() {
			System.out.println(" Enter The Number :");
			int n=in.nextInt();
			int sum=2;
			if(n<31) {
				for(int i=1;i<=n;i++) {
					sum=sum*2;
					System.out.println(" 2^"+i+" = "+sum);
					
					int len=String.valueOf(sum).length();
					if(len==4) {
						System.out.println("Here Is All We FOund Leap Year ");
						Utility.leap(sum);
					}
					
				}
			}else {
				System.out.println("Not valid number put Number between 2-31");
				TwoPower();
			}
		}
//******************************************************************************************
		/*
		 * WAP FOR DISTANCE
		 */
		public static void distance() {
			System.out.println(" Enter The Point A And Point B Distance :");
			int x=in.nextInt();
			int y=in.nextInt();
			if(x>0&&y>0) {
				double result=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
						System.out.println(" Total Distance Between both is : "+result);
			}
		
		}
//******************************************************************************************
		/*
		 * WAP FOR TimeComlexity....!!!
		 */
		static long starttime;
		static long stoptime;
	
			public static void  starttime()							//to start a time 
			{
				
				starttime= System.currentTimeMillis();
			}
			public static void stoptime()							//to stop the time
			{
				
				stoptime=System.currentTimeMillis();
				print();
			}
			public static void print() {
			System.out.println("Time Comlexity");
			System.out.println((starttime-stoptime)/1000);
			}
			
	 // WindChill Program
			
			
			
//*****************************************************************************************
//###################!!!...ALGORITHEM PROGRAM STARTED FROM HERE...!!!######################
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
		/*
		 * WAP FOR ANAGRAM TWO STRING ....!!!
		 */
		
		public static void anagram(String s1,String s2) {
			
			//first we have to fin the length 
				int x=s1.length();
				int y=s2.length();
				boolean flag=false;
			//Second we have to Convert it to character
				char ch1[]=s1.toUpperCase().toCharArray();
				char ch2[]=s2.toUpperCase().toCharArray();
			
				if(y==x) {
					 flag=true;
				}
				char temp;
				if(flag) {
			/***************************************
			 * 		
			 */
					//here we are sorting array1
					for(int i=0;i<x-1;i++) {
						for(int j=i+1;j<x;j++) {
							if(ch1[i]>ch1[j] )
							{
								temp=ch1[i];
								ch1[i]=ch1[j];
								ch1[j]=temp;
							}
						}
					}
					
			/****************************************
			 * 	
			 */
					/*
					 * here we are sorting array2
					 */
					for(int i=0;i<y-1;i++) {
						for(int j=i+1;j<y;j++) {
							if(ch2[i]>ch2[j] )
							{
								temp=ch2[i];
								ch2[i]=ch2[j];
								ch2[j]=temp;
							}
						}
					}
					
				}
				String xyz=new String(ch1);
				String pqr=new String(ch2);
				System.out.println("String 1 \""+xyz+"\"");
				System.out.println("String 2 \""+pqr+"\"");
				System.out.println();
				if(x==y) {
					if(xyz.equals(pqr)) {
						System.out.println("  We Found Anagram..!!");
					}else {
						System.out.println("   Not A Anagram..!!");
					}
				}
		}
//*******************************************************************************************
		/*
		 * PRINT PRIME NUMBER BETWEEN 0-N
		 */

		public static void primeNumber(int n) {
			boolean flag=false;
			for(int i=2;i<=n;i++) {
				for(int j=2;j<i;j++) {
						if(i%j==0) {
							flag=false;
							break;
						}else {
							flag=true;
							}
					}
						if(flag) {
								System.out.println(i);
									}
			}
			
		}
//*****************************************************************************************
		/*
		 * Extend the above program to find the prime numbers that are Anagram and Palindrome 
		 */
		
		public static List<Integer> Al1=new ArrayList<Integer>();
		public static List<Integer> Al2=new ArrayList<Integer>();
		public static int count=0;
		public static void Prime_Facto_Anagram(int n) {
			
				boolean flag=false;
				for(int i=2;i<=n;i++) {
					count++;
					for(int j=2;j<i;j++) 
					{
							if(i%j==0) {
										flag=false;
										break;
							}else {
										flag=true;
								  }
					}
					if(flag) {
							//System.out.println(i);
							Palindrome(i,n);
						}
				}
				
			}
		public static void Palindrome(int c,int y)
		{
			int r,sum=0;
			int res=c;
					while(c!=0) {
						r=c%10;
						sum=sum*10+r;
						c=c/10;	
					}
					if(res==sum) {
						/*
						 * System.out.println("Plaindrome Number IS :"+sum);
						 */
						Al1.add(res);
						Al2.add(sum);
						
					}
					if(count>y-3)
					AnagramPrime(Al1, Al2);
			
		}
		public static void AnagramPrime(Object s1,Object s2) {
			int x=String.valueOf(s1).length();
			int y=String.valueOf(s2).length();
			
			if(x==y) {
				System.out.println("Prime Number Palindrome is :"+s2);
				System.out.println("Anagrame & Palindrome is :"+s1);		
			}
		}	
//*************************************************************************************
		/*
		 * SORT AND SEARCHING MENU PROGRAM
		 */
		public static void insertionSort() {
			System.out.println("Welcome, This is Insertion sort for \"String\"");
			System.out.println("Enter The Array Size :");
			int g=in.nextInt();
			String insert[]=new String[g];
			System.out.println("Enter The String in array");
			for(int i=0;i<g;i++) {
				if(i<g) {
				String str=in.nextLine();
				insert[i]=str.toUpperCase();
				}else {
					System.out.println("Your array is full");
				}
			}
			System.out.println("Before The Sorting String");
			for(String i:insert) {
				System.out.print(i+",");
			}
			
			int j=0;
			int n=insert.length;
			String temp=null;
			for(int i=1;i<n;i++) {
				temp=insert[i];
				starttime();
				j=i-1;
				while(j>=0) {
					if(temp.compareTo(insert[j])>0)
					{
						break;
					}
						insert[j+1]=insert[j];
						j--;
					
				}insert[j+1]=temp;
				
			}stoptime();
			System.out.println("After Sorting");
			for(String i:insert) {
				System.out.print(i+",");
			}
		}
		public static void bubbleSort() {
			System.out.println("Welcome, This is Bubble-sort for \"String\"");
			
			
			String array[]= {"MAYA","SUNIL","AJAY","DIPA","SHUSHMA","POOJA","PRIYA","ZENDAR"};
			int n=array.length;
			System.out.println("Before Sorting ....!!!");
			for(String x :array) {
				System.out.print(x+",");
			}
			System.out.println();
			String temp;
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(array[i].compareTo(array[j])>0) {
						temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
			}
			System.out.println();
			System.out.println("After Sorting ....!!!");
			for(String x :array) {
				System.out.print(x+",");
			}
		}
		public static void binarySearch() {
			System.out.println("Welcome, This is Binary-Search for \"String\"");
			
			System.out.println("Enter the String what you want to search");
			String key="ZENDAR";
			String array[]= {"AJAY","BUBBLE","DIPA","SUNIL","SUSHMA","ZENDAR"};
			int r=array.length-1;
			int l=0;
			int m=0;
			boolean flag=true;
			while(flag) {
				m=(l+r)/2;
				int res=key.compareTo(array[m]);
				if(res==0) 
				{
					System.out.println("Position of the key is : "+m);
					flag=false;
				}
				if(res>0)
				{
						l=m+1;
				}else 
				{
						r=m-1;
				}
			}
			 
		}
		public static void insertionIntSort() {
			System.out.println("Welcome, This is Insertion sort for \"Integer\"");
			int insert[]= {2,34,5,67,87,3,1,2,3,4,5,4,3,2,1,67,89,80,9};
			int j=0;
			int n=insert.length;
			int temp=0;
			for(int i=1;i<n;i++) {
				temp=insert[i];
				j=i-1;
				while(j>=0&&insert[j]>temp) {
					
						insert[j+1]=insert[j];
						j--;
					
				}insert[j+1]=temp;
				
			}
			for(int i:insert) {
				System.out.print(i+",");
			}
			
		}
		public static void bubbleIntSort() {
			System.out.println("Welcome, This is BubbleIntSort for \"Integer\"");
			System.out.println("Enter The Array Size");
			int g=in.nextInt();
			int array[]= new int[g];
			System.out.println("Enter Element..!!");
			for(int i=0;i<g;i++) {
				int value=in.nextInt();
				array[i]=value;
			}
		
			
			int n=array.length;
			System.out.println("Befor Sorting ....!!!");
			for(int x :array) {
				System.out.print(x+",");
			}
			System.out.println();
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
			System.out.println("After Sorting ....!!!");
			for(int x :array) {
				System.out.print(x+",");
			}
		}
		public static void binaryIntSearch() {
			System.out.println("We char temp; lcome, This is Binary-Search  for \"Integer\"");
			
			System.out.println("Enter the Number what you want to search");
			int key=in.nextInt();
			int arr[]= {0,1,7,8,9,23,45,45,45,67,67,123,432};
			int r=arr.length-1;
			int l=0;
			int m=0;
			boolean flag=true;
			while(flag) {
			m=(l+r)/2;
				if(key==arr[m]) {
					System.out.println("Position of the key is : "+m);
				   flag=false;
				}
				else if(arr[m]<key) {
						l=m+1;
				}else {
						r=m-1;
						}
			}
			 
		} char temp; 
		/*********************************************************************************************
		 * VENDING MACHINE PROGRAM
		 * @param arr
		 * @param n
		 */
		public static void Account(int arr[],int n) {
			
			System.out.println(" Please Enter Your Amount ");
			int cash=in.nextInt();
			int res,count=0;
			for(int i=0;i<n&&cash>0;i++) {
				res=cash/arr[i];
				cash=cash-arr[i]*res;
				if(arr[i]>0&&res!=0) {
				System.out.println("You collected RS"+arr[i]);
				System.out.println("You have got.. "+res);
				count+=res;
				}
		}
			System.out.println("Total number of notes : "+count);

	}
///////////////////////////////////////////////////////////////////////////////////////////////
		/* 
		 *  MERGE SORT
		 */
		
		static int array[];
		static int tempMergeArr[];
		static int length;
		
		public static void sort(int input[])
		{
			array=input;
			length=array.length;
			tempMergeArr=new int[length];
			divide_Array(0,length-1);
		}
		
		public static void divide_Array(int LowerIndex,int HigherIndex) {
			
			
			if(LowerIndex<HigherIndex) 
				{
				
				int middle=LowerIndex+(HigherIndex-LowerIndex)/2;
				
				//it will sort left side of array
				divide_Array(LowerIndex,middle);
			
				//it will sort right side of array
				divide_Array(middle+1, HigherIndex);
				
			
				mergeArray(LowerIndex, middle, HigherIndex);
				
				
			}
		}
		
		public static void mergeArray(int lowerIn,int mid,int higherIn) {
			System.out.println("Before..!!");
			for(int s:tempMergeArr) {
				System.out.print(s+",");
			}
			System.out.println();
			for(int i=lowerIn;i<=higherIn;i++) {
				
				tempMergeArr[i]=array[i];
				
			}
			
			System.out.println("After");
			for(int s:tempMergeArr) {
				System.out.print(s+",");
			}
			System.out.println();
			
				int i=lowerIn;
				int m=mid+1;
				int k=lowerIn;
				
				while(i<=mid&&m<=higherIn)
				{
					if(tempMergeArr[i]<tempMergeArr[m]) 
					{
						array[k]=tempMergeArr[i];
						i++;
					}else {
						array[k]=tempMergeArr[m];
						m++;
					}
					k++;
				}
				while(i<=mid) {
					array[k]=tempMergeArr[i];
					i++;
					k++;
					
				}	
				
			}	
//**************************************************************************************************************************
		/**
		 * Function to check the day of the week of given date
		 *
		 * @param d int value for day of date
		 * @param m int value for month of year
		 * @param y int value for year
		 * @return day of week from 1 to 7
		 */
		public static int  dayOfWeek(int d,int m, int y) 
		{
			
			
			
			int y0 = y - (14 - m) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = m + 12 * ((14 - m) / 12) - 2;
			int d0 = (d + x + (31 * m0) / 12) % 7;
			
			String days[]=  {"Sunday", "Monday", "Tuesday", "Wednessday", "Thusday", "Friday", "Satuday"};
			System.out.println(days[d0]);
			in.close();
			return d0;
		}
		/**
		 * Function to convert fahrenheit to celcius and vice-versa
		 *
		 * @param tem the value of temperature
		 * @param t   the character ie c or f for given temp to convert
		 * @return converted temperature
		 */
		public static int temperaturConversion(int tem, char t) 
	    {
			int conver;
			if (t == 'c' || t == 'C') 
			{
				conver = (tem * 9 / 5) + 32;
			} 
			else if (t == 'f' || t == 'F') 
			{
				conver = (tem - 32) * 5 / 9;
			} 
			else 
			{
				System.out.println("Enter correct input");
				return 0;
			}
			return conver;
		}

	/////////////////////////////////////////////////////////////////////////////////////////////
		/**
		 * Function to search a number in a array using binary search algorithm
		 * 
		 * @param choice is for taking choice from user
		 */	
		public static void binarySearch(int lower,int higher,int middle)
			{
			String choice,choice1;
				try {
					System.out.println("Here Is Your Number "+middle+" Is It Correct....(Yes/No)");
					 choice=in.next().toUpperCase().trim();
					 
					if(choice.equals("YES")) {
						System.out.println("OlAA...We Always Knows Your Need...!!!");
					}else if(choice.equals("NO")) {
						System.out.println("We Wanted to Know is Number Greater...(Y/N)");
						choice1=in.next().toUpperCase().trim();
						if(choice1.equals("YES")) {
							lower=middle+1;
							middle=(lower+higher)/2;
							binarySearch(lower, higher, middle);
						}else if(choice1.equals("NO")) {
							higher=middle-1;
							middle=(lower+higher)/2;
							binarySearch(lower, higher, middle);
						}
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			}
		//****************************************************************************************
		/**
		 * to calculate monthly payment for r interest and p principal for y years
		 *
		 * @param p the principal amount given
		 * @param y the year for which p is given
		 * @param r the rate at which p is given
		 * @return monthly payment
		 */
		public static double monthlyPayment(double p, double y, double r) 
		{
			double n = 12 * y;
			double r0 = r / (12 * 100);
			double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
			return payment;
		}
/*****************************************************************************
 * 	static function sqrt  to compute the square root of a nonnegative number c given in the input using Newton's method:
- initialize t = c
- replace t with the average of c/t and t
- repeat until desired accuracy reached using condition Math.abs(t - c/t) > epsilon*t where epsilon = 1e-15;	
 */
		public static void  Sqrt1() {
			System.out.println("Enter the value ");
			double c=in.nextDouble();
			double t=c;
			double epsilon=1e-15;
			while(Math.abs(t-c/t)>epsilon*t) {
				t=(c/t+t)/2.0;
			}
			System.out.println(t);
		}
		
		
		
/**************
 * Binary.java to read an integer as an Input, convert to Binary using toBinary function and perform the following functions.
	i. Swap nibbles and find the new number.
	ii. Find the resultant number is the number is a power of 2.
	A nibble is a four-bit aggregation, or half an octet. There are two nibbles in a byte.
	Given a byte, swap the two nibbles in it. For example 100 is to be represented as 01100100 in a byte (or 8 bits). The two nibbles are (0110) and (0100). If we swap the two nibbles, we get 01000110 which is 70 in decimal.
		
 */
		
		public static int[] toBinary(int Number) {
			int i=0;
			int mInteger=Number;
			
			int array[]=new int[8];
			int array1[]=new int[8];
			
			while(mInteger>0) {
				array[i]=mInteger%2;
				mInteger/=2;
				i++;
			}
			System.out.println("Binary number is :");
			for(int j=0;j<array.length;j++) {
				System.out.print(" "+array[array.length-j-1]);
				array1[j]=array[array.length-j-1];
			}
			return array1;
		}
		
	/*
	 * Here We are Swaping Nibbles	
	 */
		public static int[] swapNibble(int array[]) {
			int temp,j=array.length-4;
			for(int i=0;i<4;i++) {
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				j++;
			}
			System.out.println("\n After Swapping ");
			for(int i=0;i<8;i++) {
				System.out.print(" "+array[i]);
			}
			System.out.println();
			return array;
		}
/****************************************************************************************************
 * **********************************************************************************************************
 * *********************************** DATA STUCTURE STARTED FROM HERE***********************************************
 * *************************************************************************************************************************		
 */
		
		
}
