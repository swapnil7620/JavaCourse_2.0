package com.Polymorphism;


public class DemoMethodOverriding {

	public static void main(String[] args) {
		
		Animal objAnimal;
		
		
		
		objAnimal = new Dog("Tom", 10,"Black");
		objAnimal.show();
		objAnimal.Sound();
		
		
//		Dog dog = new Dog("Tom", 5, "Brown");	
//	       dog.show();
//	       dog.Sound();
//	       
//	     Cat cat = new Cat("Oggey", 10,"English");
//	     cat.show();
//	     cat.Sound();
	}

}
