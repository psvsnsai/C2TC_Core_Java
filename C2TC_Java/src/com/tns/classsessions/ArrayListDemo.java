package com.tns.classsessions;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList(); 
		arr.add("A"); // Heterogeneous
		arr.add(1000); // support of inbuilt methods
		arr.add(4.5);
		arr.add(null);
		arr.remove(2);

		arr.add(2, "M");
		arr.add("N");
		System.out.println(arr);
	}

}