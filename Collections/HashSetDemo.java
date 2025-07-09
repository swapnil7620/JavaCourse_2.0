package com.Collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		        // Hash Table is class and its Synchronize
				// Hash set is a way and its stored in hash table
				// internally it use has table to stored a data
				//  by using Hash code -- using code
				// and its does'nt maintain order  maintain order
				
				// By Default Synchronize 
				// it is child of set interface 
				
				// it allows null but only one
				HashSet<Integer> hSet = new HashSet<Integer>();
				hSet.add(10);
				hSet.add(30);
				hSet.add(60);
				hSet.add(20);
				hSet.add(35);
				hSet.add(35);
				hSet.add(null);
				hSet.add(null);
				System.out.println(hSet);


	}

}
