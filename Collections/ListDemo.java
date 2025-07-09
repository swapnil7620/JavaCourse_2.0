package com.Collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListDemo {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(11);
		arrayList.add(21);
		arrayList.add(31);
		arrayList.add(41);
		arrayList.add(51);
		
		
		
//		System.out.println(" The Array Element : " +arrayList);
//		
//		arrayList.add(61);
//		arrayList.add(71);
//		// To check the size
//		System.out.println(" size of Array : "+arrayList.size());
//		
//		arrayList.set(3,100);// it set the value 
//		System.out.println("The Array list after replacing value at 4th index : "+arrayList);
//		
//		arrayList.remove(3);
//		System.out.println("After removing an element at position 3 "+arrayList);
//		
//		//clear() // we can called its as a flush
//		arrayList.clear();
//		System.out.println("To remove all element from array "+arrayList);
//		
		
		// with for loop
		
       for (int i = 0; i < arrayList.size(); i++) {
    	   
    	   System.out.println(arrayList.get(i));
			
		}
       // with enhanced for loop 
       for (int i : arrayList) {
    	   System.out.println(i);
    	   
    	//  enhanced for loop using iterator
    	   
    	  Iterator<Integer> itr = arrayList.iterator();
    	  while(itr.hasNext() ) {
    		  System.out.println(itr.next());
    		  
    		  
    	  }
		
	}
		
	}

}
