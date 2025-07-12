package com.Polymorphism;

 public class Animal{
	
	protected String Name;
	protected int Age;
	
	public Animal(String Name,int Age) {
		this.Age=Age;
		this.Name=Name;
		
	}
	public void Sound() {
		System.out.println("Sounds of Animals ");
		
	}
	public void show() {
		System.out.println(" Name : " + Name + " :  Age is : " +Age);
	}
}