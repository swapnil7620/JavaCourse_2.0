package com.Polymorphism;

public class MainArea {
	public static void main(String[] args) {
		Circle circle= new Circle(3.14, 5);
		circle.Area();
		
		Cylinder cylinder = new Cylinder(5, 5, 3.14);
		cylinder.Area();
		
//		 Circle circle = new Cylinder(5, 5,3.14);
//		 circle.Area();
	}
}
