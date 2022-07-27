package com.tns.assignments;

public class ForLoop2 {
	public static void main(String[] args) 
	{	
		int num = 14;
		boolean isPrime = true;     //default
		
		for(int i = 2; i < num/2; i++)
		{
			if(num % i == 0)
			{
				isPrime = false;
			}
		}
		if(isPrime == true)
		{
System.out.println("The number is a prime number");
		}
		else
		{
System.out.println("The number is not a prime number");
		}
		

	}

}
