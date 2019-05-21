/**********************************
 * @purpose  Number of Binary Search Tree
 *  @author  :Sunil Yenare
 * 	@version : 1.0
 *	@since	 :10/05/2019
 * 
 */


package com.bridgeLabz.datastructure;
import java.util.Scanner;
public class BinarySearchTree {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//enter the limits so that they can find the possible node of numbers nth timess.
		System.out.println("Enter the limits :"); 
		int limit=sc.nextInt();
		int [] number= new int[limit];
		//Loop will work till the entered numbers of limits.
        for(int i=0;i<limit;i++)			
		{
			System.out.println("Enter a number:");
			number[i]=sc.nextInt();
            
		//We are calling the method factnumber which is been created in class Factorial.
			long x=BinarySearchTree.factnumber(number[i]);    
			System.out.println("Possible number of "+number[i]+" node is "+x);
		}
	}
	
   public	static long factnumber(int number)
   { 

		long value=factorial(2*number)/(factorial(number+1)*factorial(number));
		return value;
	}

	/*From this method we are finding the factorial of a number using long .*/	
	public static long factorial(long y)
	{
		long fact=1;
		for(long i=1;i<=y;i++)
		{
			fact=fact*i;
		}
		return fact;
}
	

}
