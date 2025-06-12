package com.ExampleInheritance;

public class Car implements Vechicle, Fuel {

	public void fuelType(String fuel) {
		System.out.println("Fuel type is :"+fuel);

	}
	
	public void stop() {
		System.out.println("Car has now Stopped");
	}

	public static void main(String[] args) {
		
		Car car = new Car();
		car.start();
		car.fuelType("Petrol");
		car.stop();
		Vechicle.stop();

	}

}
