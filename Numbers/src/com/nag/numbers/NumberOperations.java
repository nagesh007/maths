package com.nag.numbers;


/**
 * 
 * @author NAGESH
 * 
 * 
 *  I am planning to cover few operations 
 *  
 *     - Reverse of Number and Palindrome
 * 
 *     - HCF and LCM
 *
 *	   - Convert Binary to Decimal and vice-versa
 *
 */
public class NumberOperations {



	/**
	 * 
	 * @param n
	 * 		+ve integer
	 * 
	 * @return
	 * 
	 * 		reverse of the given number
	 */
	public int reverse(int n)
	{
		int ans=0;
		int reminder=0;

		while(n!=0)
		{
			
			reminder=n%10;
			ans= ans*10+reminder;
			n=n/10;
			
			
			/*
			 * Ex: n = 1234
			 * 
			 * Note : We are able to achieve bcz we are playing with integer data type
			 * 
			 *  First Iteration
			 *  --------------------
			 *  Initial n = 1234
			 *  reminder = 4
			 *  ans = 4
			 *  n = 123
			 *  
			 *  Second Iteration
			 *  --------------------
			 *  Initial n = 123
			 *  reminder = 4
			 *  ans = 4
			 *  n = 123
			 *  
			 *  ..
			 *  ...
			 *  ....
			 */
			
			
		}
		return ans;
	}


	/**
	 * 
	 * @param n
	 * 		+ve integer
	 * 
	 * @return
	 * 
	 * 		boolean
	 */
	public boolean checkWhetherItIsPalindrome(int n)
	{
		int ans=0;
		int reminder=0;
		int originalNumber=n;

		while(n!=0)
		{
			/*
			 * Ex: n = 1234
			 * 
			 * Note : We are able to achieve bcz we are playing with integer data type
			 * 
			 *  First Iteration
			 *  --------------------
			 *  Initial n = 1234
			 *  reminder = 4
			 *  ans = 4
			 *  n = 123
			 *  
			 *  Second Iteration
			 *  --------------------
			 *  Initial n = 123
			 *  reminder = 4
			 *  ans = 4
			 *  n = 123
			 *  
			 *  ..
			 *  ...
			 *  ....
			 */
			reminder=n%10;
			ans= ans*10+reminder;
			n=n/10;
		}
		if(ans==originalNumber)
		{
			// if original number is same as reverse the it is palindrome
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	/**
	 * 
	 *  H.C.F is calculated using <b>Euclid's Division Lemma</b><br/> 
	 * 
	 * @param m
	 * @param n
	 * @return
	 *   
	 *    H.C.F of m and n
	 */
	public int hcf(int m, int n)
	{
		int reminder=0;
		
		while(n!=0)
		{
			reminder=m%n;
			m=n;
			n=reminder;
		}
		return m;
	}
	
	/**
	 * 
	 *  L.C.M is calculated using the following formula <br/> 
	 *  
	 *  L.C.M (m,n) = (m*n)/H.C.F(m,n)
	 *  
	 *  
	 * @param m
	 * @param n
	 * @return
	 *  
	 *   L.C.M of m and N
	 *   
	 */
	public int lcm(int m,int n)
	{
		
		int lcm=0;
		
		lcm=(m*n)/hcf(m,n);
		return lcm;
		
	}
	
	

}
