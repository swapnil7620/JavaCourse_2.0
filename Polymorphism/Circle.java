package com.Polymorphism;

public class Circle extends Shape {
	
	
	protected  int Radius;
	
	public Circle(double pi , int Radius) {
		
		super(pi);
		this.Radius=Radius;	
	}
	
	public void Area() {
   
		System.out.println("Area of Circle is :"+ pi*(Radius*Radius));
	}

}
