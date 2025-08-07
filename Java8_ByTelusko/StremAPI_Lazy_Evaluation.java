package com.Java8_ByTelusko;

import java.util.Arrays;
import java.util.List;

public class StremAPI_Lazy_Evaluation {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,20,2,3,4,90);
		
		// Lazy Evaluation and terminal method or terminal function
		// filter and map are lazy and findFirst , for-reach method is terminal method
		
		/*
		 Summary  of  Stream API
		 Streams use internal iteration
		 Streams promote declarative programming, not imperative
		 Streams support lazy evaluation through intermediate operations like filter() and map(),
		  which are only executed when a terminal operation like reduce() or findFirst() is called
		  
		 */
		
		int result =0;
		for (int i : list) {
			
			if (i% 5==0) {			
				result = i *2;
				break;
			}
		}
		System.out.println(result);
		
		
		/*
		System.out.println(list.stream().
				           filter(i-> i % 5 == 0).
				           map(i -> i*2).
				           findFirst().
				           orElse(0));
				           */
		
		System.out.println(list.stream().
	           	filter(StremAPI_Lazy_Evaluation::isDivison).
		        map(StremAPI_Lazy_Evaluation::mapDouble).
		        findFirst().
		        orElse(0));
	}
	
	public static boolean isDivison(int i) {
		
		System.out.println("is Dvs " + i);
		return  i % 5 == 0;
	}
	
	public static int mapDouble(int i) {
		
		System.out.println("is Double "+ i);
		return i * 2;
	}
	
	
}
