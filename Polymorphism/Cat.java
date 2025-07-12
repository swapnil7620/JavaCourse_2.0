package com.Polymorphism;


public class Cat extends Animal {

	private String breed;
	
	public Cat(String Name,int Age,String breed) {
		super(Name, Age);
		this.breed=breed;
		
	}
	
	public void Sound() {
		System.out.println(" cat sounds like Meow");
	}
	public void show() {
      super.show();		
		System.out.println(" Breed of  Cat is : " +breed);
	}

}
