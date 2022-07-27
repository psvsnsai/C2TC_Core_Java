//Program to demonstrate a Multilevel Inheritance in Java

package com.tns.assignment2;

class Engine {
	public void engineFunction() {
		System.out.println("This is engine.");
	}
}

class Speed extends Engine {

	public void speed(int s) {
		System.out.println("Speed Applied: " + s);
	}
}

class Vehicle extends Speed {

	public void vehicleType(String type) {
		System.out.println("Vehicle type: " + type);
	}
}

public class MultilevelInheritance {

	public static void main(String args[]) {
		Vehicle obj = new Vehicle();
		obj.vehicleType("Car");
		obj.engineFunction();
		obj.speed(80);
	}
}
