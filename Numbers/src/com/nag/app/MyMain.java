package com.nag.app;

import com.nag.numbers.NumberOperations;

public class MyMain {

	public static void main(String[] args) {
		
		
		NumberOperations obj=new NumberOperations();
		
		int num=1234;
		int reverse=obj.reverse(num);
		System.out.println("Number : "+num+"  Reverse : "+reverse);
		
		int pNumber=1234321;
		boolean palindrome=obj.checkWhetherItIsPalindrome(pNumber);
		System.out.println("Palindrome Checking , Number : "+pNumber+"  Is it Palindrome ? : "+palindrome);
		
		/*
		 * TODO: Think about following things
		 *  
		 *   > -ve input
		 *   > Units place ending with zero  
		 */

	}

}
