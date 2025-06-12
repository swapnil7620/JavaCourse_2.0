package com.ExampleInheritance;

public class Inheritance implements Printable, Showable {

	@Override
	public void Show() {
		System.out.println("showing from showable interface");

	}

	@Override
	public void print() {
		System.out.println("printing from printable interface");
	}
	public static void main(String[] args) {
		Inheritance inheritance = new Inheritance();
		inheritance.Show();
		inheritance.print();
	}

}