package com.tns.classsessions;

public class String2 {

	public static void main(String[] args) {

		//mutable String
		String a="Avantika ";
		int b=10,c=20,d=30; //integer variables
		
//		Displaying the String and integer together
		System.out.println(a+b+c+d);//Avantika102030
		System.out.println(b+c+d+a);//60Avantika...
		System.out.println(b+c+a+d);//30Avantika30
		System.out.println(b+a+c+d);//10Avantika2030

	}

}
