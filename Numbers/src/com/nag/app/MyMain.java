package com.nag.app;

import com.nag.numbers.NumberOperations;
import com.nag.numbers.Numbers;

public class MyMain {

	public static void main(String[] args) {
		
		
		NumberOperations obj=new NumberOperations();
		
		
		//  Reverse and Palindrome
		int num=1234;
		int reverse=obj.reverse(num);
		System.out.println("Number : "+num+"  Reverse : "+reverse+"\n");
		
		int pNumber=1234321;
		boolean palindrome=obj.checkWhetherItIsPalindrome(pNumber);
		System.out.println("Palindrome Checking , Number : "+pNumber+"  Is it Palindrome ? : "+palindrome+"\n");
		
		// TODO: Think about negative input and numbers ending with zero (units place)  
		 
		
		// H.C.F
		int m=8;
		int n=6;
		int hcf=obj.hcf(m, n);
		System.out.println("H.C.F / G.C.D of ("+ m+ ","+n+") is "+hcf+"\n");
		
		
		// L.C.M
		int x=5;
		int y=15;
		int lcm=obj.lcm(x, y);
		System.out.println("L.C.M of ("+ x+ ","+y+") is "+lcm+"\n");
		
		
		
		// Swap 2 numbers
		Numbers inp=new Numbers(10, 20);
		Numbers result1 = obj.swap(inp);
		System.out.println("Before swap : a = "+inp.getA() + " b = "+inp.getB());
		System.out.println("After swap : a = "+result1.getA() + " b = "+result1.getB()+"\n");
		
		
		// Swap 2 numbers  without using temo variable
		Numbers input=new Numbers(5, 20);
		Numbers res = obj.swap(input);
		System.out.println("Before swap (special) : a = "+input.getA() + " b = "+input.getB());
		System.out.println("After swap (special) : a = "+res.getA() + " b = "+res.getB()+"\n");
	}

}
