package com.tns.classsessions;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
	
		
		//class,object,method
		System.out.println("Enter two numbers=");   //print the numbers
		
		try (Scanner s = new Scanner(System.in)) {
			//s -- Object for scanner class
			//we create OBJECTS in java.. with NEW operator
int a=s.nextInt();
int b=s.nextInt();         //s-- object belongs to scanner class
                     //nextInt()--reading input

int sum =a+b;
System.out.println("The sum is=" +sum);
		}

	}

}
