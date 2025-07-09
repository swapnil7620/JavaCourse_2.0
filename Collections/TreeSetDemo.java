package com.Collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		// sort the data in natural order
		// duplicates are all not allowed
		// Non synchronize is not available
		// NULL IS NOT ALLOWED
		// Red & Black trees  it use
		// it use to sort all data elements
		tSet.add(10);
		tSet.add(20);
		tSet.add(50);
		tSet.add(900);
		tSet.add(100);
		tSet.add(1);
		tSet.add(230);
		tSet.add(21);
		
		System.out.println("The Tree set is : "+tSet);
		
		tSet.add(5000);
		tSet.add(5000);
		tSet.add(0);
		System.out.println("The Tree set is : "+tSet);
	
		
		
	}

}
