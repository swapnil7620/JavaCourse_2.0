package com.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		// all of them are non synchronize
		// if we want synchronize
		// we need to use method like synchronize_list , synchronize map
		// collection. synchronize like method use use
		// and for iteration we need to use synchronize block
		
		// HashMap
		// LinkHashMap
		// Tree_map

		// Map interface has its own methods
		// Iterator is not available because its map is not part of collection
		// put is use to insert the elements in map interface
		// by default sorting is not available means it doen'nt maintain order
		// it does not contain duplicate
		// but its contain duplicate

		// Map

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(121, "Swapnil");
		hashMap.put(3, "Suyog");
		hashMap.put(2, "Vaibhav");
		hashMap.put(9, "Nishnat");
		hashMap.put(9, "a");
		hashMap.put(10, "Nishnat");
		hashMap.put(null, null);
		
        //Returns the value to which the specified key is mapped,or null if this map contains no mapping for the key. 
		System.out.println(hashMap.get(3));

		for (Map.Entry<Integer, String> entry : hashMap.entrySet())
		{

			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}

}
