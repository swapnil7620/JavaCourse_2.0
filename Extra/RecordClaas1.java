package com.Extra;

import java.util.Objects;
/*
class AlienData {
	private final int id;
	private final String Name;

	public AlienData(int id, String Name) {
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
	    if (obj == null || getClass() != obj.getClass())
	        return false;
	    AlienData other = (AlienData) obj; // Corrected from Alien to AlienData
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
record AlienData(int id, String Name) {}

public class RecordClaas1 {	
		public static void main(String[] args) {
		
			AlienData R1 = new AlienData(1,"Swapnil");
			AlienData R2 = new AlienData(1,"Swapnil");
		
		// if you want value you can get those value without using getter and setter
			
//		System.out.println(R1.getId());
//		System.out.println(R2.getName());
			
	/*-------------------------------------------------------------------*/		
     		System.out.println(R2.id());
    		System.out.println(R2.Name());
			
		System.out.println(R1.equals(R2));// false  because they are two different object with same content (we know this but java does'nt  know this)  so we need to tell java 
		System.out.println(R2);
	
		
		
	}

}





//record AlienData(int id, String Name) {}


//record Alien(int id, String Name) implements Cloneable 
//{
//	 public Alien
//	 {
//		 if (id==0) {
//			 throw new IllegalArgumentException("id cannot be is not zero");			
//	       }
//	 }
//}



//record RealAlien(int id, String Name) {} // This one is a actual syntax 


