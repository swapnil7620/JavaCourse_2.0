package com.Polymorphism;

public class Dog extends Animal {

	private String color;

	public Dog(String Name, int Age, String color) {
		super(Name, Age);
		this.color = color;

	}

	public void Sound() {
		System.out.println(" Dog is Barking");
	}

	public void show() {
		super.show();

		System.out.println(" Color of Dog is : " + color);
	}

}
