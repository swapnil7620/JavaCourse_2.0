package com.Extra;

// we can overload the main method
class First {

	public static void M1() {
		{
			System.out.println("Hi from static..");
		}

	}
}

public class MainMethodsOverloading extends First {

	public static void main(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		System.out.println("m1 from main");
		main(10, 20);
		System.out.println("........");
		
	}

}
