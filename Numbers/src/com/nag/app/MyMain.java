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

		
		
		
		// H.C.F
		int m=8;
		int n=6;
		int hcf=obj.hcf(m, n);
		System.out.println("H.C.F / G.C.D of "+ m+ " and "+n+" is "+hcf);
		
		
		// L.C.M
		int x=5;
		int y=15;
		int lcm=obj.lcm(x, y);
		System.out.println("L.C.M of "+ x+ " and "+y+" is "+lcm);
		
		
		
	}

}
