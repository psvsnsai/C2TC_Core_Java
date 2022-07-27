package com.tns.classsessions;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the length= ");
			double length = s.nextDouble();
			System.out.println("Enter the width= ");
			double width = s.nextDouble();
			
			
			double area = length*width;
			System.out.println("Area of Rectangle =" +area);
		}

	}

}
