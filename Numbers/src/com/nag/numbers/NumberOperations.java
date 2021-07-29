package com.nag.numbers;

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
			 * 
			 */
			reminder=n%10;
			ans= ans*10+reminder;
			n=n/10;
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
			 * 
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

}
