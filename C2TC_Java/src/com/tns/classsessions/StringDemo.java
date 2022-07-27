package com.tns.classsessions;
public class StringDemo {

	public static void main(String[] args) {

		//creating new String
		String s1= new String ("123");
		String s2= new String ("123");     //both refer to different objects
		
		//checking for equality in strings and printing the results
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2); 
	}

}