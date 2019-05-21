package com.bridgeLabz.datastructure;

/********************************************************************************************
 * 
 * @purpose 	:adding anagrams to queue
 * @author 		:Sunil Yenare
 * @version 	: 1.0
 * @since		: 07-05-2019
 * 
 ********************************************************************************************/

public class Primequeue {
public static void main(String[] args) {
	Utilityds util=new Utilityds(); // creating utility class object
	int[] arr=util.prime();	// collecting prime numbers
	int[] anag=util.checkanagaram(arr);	//collecting anagrams
	for (int i = 0; i < anag.length; i++) {	//loop to add elements to queue
		util.queue.enqueue(anag[i]);		// adding elements to queue
	}
	for (int i = 0; i < anag.length; i++) {
		util.queue.dequeue();			// removing elements from queue
	}
}
}
