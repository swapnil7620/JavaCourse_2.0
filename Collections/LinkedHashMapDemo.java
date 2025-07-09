package com.Collections;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	
	public static void main(String[] args) {
		
		
		LinkedHashMap<Integer, String> LHS = new LinkedHashMap<Integer, String>();
		LHS.put(200, "D");
		LHS.put(548, "C");
		LHS.put(12, "E");
		LHS.putFirst(11, "A");
		LHS.putLast(999, "Z");
	    
		
		// Make the Clone of and LinkedHashMap
		   Object  aBC =   LHS.clone();	   
		   System.out.println(aBC);
		     
			
	   
		// To check the weather is contain particular element or not
	 	System.out.println(LHS.containsValue("A"));
		
		 // To print the ListHashMap : entrySet()
	    	System.out.println(LHS.entrySet());
	
		
		for (Map.Entry<Integer, String> entry : LHS.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(" Keys = "+ key + " Values = " +val);
			
		}

	}

}
