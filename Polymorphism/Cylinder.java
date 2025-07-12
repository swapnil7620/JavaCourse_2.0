package com.Polymorphism;

 class Cylinder extends Circle {
	protected int height;

	public Cylinder(int height, int Radius, double pi) {

		super(pi, Radius);
		this.height = height;

	}
	public void Area() {
		System.out.println("Area of Cylinder is : " +pi*Radius*Radius*height);
	}

}
