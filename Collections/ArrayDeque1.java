package com.Collections;

import java.util.ArrayDeque;
public class ArrayDeque1 {

	public static void main(String[] args) {
		
		
		ArrayDeque<Integer> AD = new ArrayDeque<Integer>();
		AD.add(100);
		AD.add(200);
		AD.offer(1);
		AD.offerFirst(10);
		AD.offerLast(225);
	

		AD.add(100);

		// It Does'nt Accept null value its throwing Null pointer Exception 
//        	AD.add(null);
		System.out.println(AD);
			
		
		

	}

}
