package com.Polymorphism;

public class Polymorphism {
	

	public static int add(int a,int b) {
		System.out.println(a+b);
		return (a+b);
		
	}
	public static void Operation() {
		System.out.println("No args Method");

	}

	public static void Operation(int radius) {
		System.out.println("The area of circle : " + 3.14 * radius * radius);
	}

	public static void Operation(int length, int width) {
		System.out.println("the rea of rectangle is : " + (length + width));

	}

	public static void main(String[] args) {
		Polymorphism.Operation();
		Polymorphism.Operation(5);
		Polymorphism.Operation(10, 20);
		
	Polymorphism.add(20, 20);

	}

}
