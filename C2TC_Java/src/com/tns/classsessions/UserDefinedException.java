package com.tns.classsessions;

import java.util.Scanner;

public class UserDefinedException {

	public static void main(String[] args) {

		int age;
		System.out.println("Enter Age");
		Scanner sc = new Scanner(System.in);

		age = sc.nextInt();

		if (age > 18) {
			System.out.println("You can Vote");
		} else {
			throw new CantVote("You cannot Vote | age less than 18");
		}

	}

	static class CantVote extends RuntimeException // unchecked Exception
	{

		public CantVote(String msg) // print stack trace method
		{
			super(msg);

		}

	}
}