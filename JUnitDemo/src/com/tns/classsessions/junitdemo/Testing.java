package com.tns.classsessions.junitdemo;

import org.junit.jupiter.api.RepeatedTest;
//import org.junit.jupiter.api.Test;

public class Testing {
//method for adding two numbers
	@RepeatedTest(20)
	void sum()
	{
        int a=10;
	    int b=20;
	    System.out.println(a+b);
    }
//method for square of a number
	int square(int x)
	{
		return x*x;
	}
//method for counting A character from a word	    
	int countA(String word)
	{
	    int count=0;
	    for (int i=0;i<word.length();i++)
	    {
	    	if (word.charAt(i)=='a' || word.charAt(i)=='A')
	    	{
	    		count++;
	    	}
	    }
	    return count;
	}

}
