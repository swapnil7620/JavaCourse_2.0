package com.Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
	
		
		TreeMap<Integer, String> TMap =  new TreeMap<Integer, String>();
		
		// It does't support null values
		// It uses Sorting to sort the data in ascending order by default
		
		TMap.put(500, "A");
		TMap.put(200, "B");
		TMap.put(600, "C");
		TMap.put(800, "D");
		TMap.put(254, "E");
		TMap.put(342, "F");
		
		// It use to delete the elements at first Position
		TMap.pollFirstEntry();
		// It use to delete the elements at Last Position
		TMap.pollLastEntry();
	
		
		// It doesn't support following method
		/*
		 	TMap.putFirst(11, "BA");
		    TMap.putLast(99, "AB");
		 */
		
		 // It use to find least key and value pair
          System.out.println(TMap.ceilingEntry(0));
          
          // It use to find least key 
          System.out.println(TMap.ceilingKey(2));
          
		// Use to sort the data in descending order
         System.out.println(TMap.descendingMap());
		
         // For Iteration this method is present in Map Interface
		for (Map.Entry<Integer, String> entry : TMap.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println(key + "= " +val);
			
		}

	}

}
