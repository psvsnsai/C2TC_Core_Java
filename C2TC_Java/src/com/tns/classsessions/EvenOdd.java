package com.tns.classsessions;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		System.out.println("Enter a Number:");
		
		try (Scanner input = new Scanner(System.in)) {
			{
				num = input.nextInt();
			}
		} 
		if(num == 0)
			System.out.println("Nothing");
		else if(num%2 ==0)
			System.out.println("Even");
		else
			System.out.println("Odd");

	}

}
