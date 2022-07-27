package com.tns.classsessions;
public class StaticVariableDemo {
	
	//Initiate variable
	String name;
	int roll;
	
//static variable collEGE
	static String coll = " SRKR ENGG College";
	
	//display method
	void display() {
		System.out.println(name+" "+roll+" "+coll);
	}
	
	public StaticVariableDemo(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	
	public static void main(String[] args) {
		
		//Create objects
		StaticVariableDemo s1 = new StaticVariableDemo("Vinay", 1);
		StaticVariableDemo s2 = new StaticVariableDemo("Vivek", 2);
		
		//call method
		s1.display();
		s2.display();
	}

}
