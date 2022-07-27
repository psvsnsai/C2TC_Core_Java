//Java program to demonstrate the Autoboxing in Wrapper class

package com.tns.classsessions.wrapperclass;

public class AutoboxingDemo {

	public static void main(String[] args) {

		int a = 10; // primitive type
		Integer in = a; // primitive to Integer object - One way

		// Alternate way
		Integer i = new Integer(30);

		// display the result
		System.out.println(a + " " + in + " " + i);
	}

}