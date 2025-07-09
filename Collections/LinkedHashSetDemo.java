package com.Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		
		
	        	  // It allows duplicate and maintain the orders		
		
				// it internally use_age linked hash map
				LinkedHashSet<Integer> LHS = new LinkedHashSet<Integer>();
				
				LHS.add(10);
				LHS.add(20);
				LHS.add(4);
				LHS.add(6);
				LHS.add(200);
				LHS.add(50);
				LHS.add(null);
				System.out.println(LHS);
				
	}

}
