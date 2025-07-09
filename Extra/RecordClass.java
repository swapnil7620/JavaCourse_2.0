package com.Extra;

import java.util.Objects;

// The variable which holds the data we called it as a state
/*
class Alien {
	private final int id;
	private final String Name;

	public Alien(int id, String Name) {
		this.id = id;
		this.Name = Name;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return Name;
	}
	
	

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alien other = (Alien) obj;
		return Objects.equals(Name, other.Name) && id == other.id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Name, id);
	}

	@Override
	public String toString() {
		return "Alien "
				+ "[id=" + id + ","
				+ " Name=" + Name + "]";
	}

	
}
*/
/*
 Its more readable and take only one line rather than write above code
 In record class we called instance variable as component
 behind the scene its creating a constructor for you which is parameterize constructor in this example
 to string method is already define so we don't need to override
 all the  instance variable in record class is by default (private and final) 
 Record class doesn't provide default constructor
 
 By default it is  a class but this class cannot extends any other class  but you can implements Interface
 // Record class can contain normal methods and static methods too
  
   
 ------In one last word ------
 
 Record class is just used to carry data 
 
*/

record RealAlien(int id, String Name) {} // This one is a actual syntax 

 record Alien(int id, String Name) implements Cloneable {
	 
//	 int age;         //  cannot declare  instance variable  here its invalid
	 static int AGE; // static variable are valid
	 
//	 
//	 public Alien() {
//		 this(0,"");
//	 }
	 
	 	 
	 // By default this implementation present in record class so we don't need to provide below constructor
	 // but if you want to add some extra implementation then we need to provide explicitly like below
	 
	 /*
	 public Alien(int id, String Name) {  //  this also called as a canonical constructor because it has same parameter as record class  but we can also create compact canonical constructor
		 
		 if (id==0) {
			 throw new IllegalArgumentException("id cannot be is not zero");
			
		}
		 this.id = id;
		this.Name = Name;
		 
	 }
	 */
	 
	 // we can also create compact canonical constructor
	 
	 public Alien{
		 if (id==0) {
			 throw new IllegalArgumentException("id cannot be is not zero");
			
		}
	 }
	 
	 // normal method
	 public void name() {
		
	}
 }
 
public class RecordClass {

	public static void main(String[] args) {
		
		Alien A1 = new Alien(1, "Swapnil");
		Alien A2 = new Alien(2, "Swapnil");
		
		// if you want value you can get those value without using getter and setter
		System.out.println(A2.id());
		System.out.println(A2.Name());
	
    
		
		System.out.println(A1.equals(A2));// false  because they are two different object with same content (we know this but java does'nt  know this)  so we need to tell java 
		System.out.println(A2);
	
	}

}
