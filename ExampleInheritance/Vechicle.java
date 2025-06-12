package com.ExampleInheritance;

public interface Vechicle {
	
	default void start() {
		System.out.println("Car is Strting");
	}

	
	static void stop() {
		System.out.println("Car has Stopped");
	}
}
