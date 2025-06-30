package com.Abstracation;

abstract class Vechicle {
	
	private int Number;
	private String Name;

	public Vechicle(int Number, String Name) {
		this.Number = Number;
		this.Name = Name;
	}

	public void Information() {
		System.out.println("Number of the Truck is :" + this.Number);
		System.out.println("Name of the Truck is :" + this.Name);
	}

	abstract public void Start();

}

class Truck extends Vechicle {

	private String Model;

	public Truck(int Number, String Name, String Model) {
		super(Number, Name);
		this.Model = Model;

	}

	public void Start() {
		System.out.println("The Track is Started ");
	}
  @Override
	public void Information() {
		super.Information();
		System.out.println("The model of Truck is : " + this.Model);
	}

}

public class AbstractionClass {

	public static void main(String[] args) {
         Truck truck = new Truck(2010, "Eicher", "3070");
         truck.Start();
         truck.Information();
	}

}
