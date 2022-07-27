package com.tns.classsessions;

public class MethodOverloading {			

	public static void main(String[] args) {
		Tests t = new Tests();

		t.m();					
		t.m(1);			//we have multiple methods with same name but with different parameters				
		t.m(1.5d);
		
		//t.m(1.5f);    //Automatically float promote to double

	}

}

class Tests {
	public void m() {
		System.out.println("I am empty");
	}

	public void m(int n) {
		System.out.println("I am int");
	}

	public void m(double n) {
		System.out.println("I am double");
	}
}

