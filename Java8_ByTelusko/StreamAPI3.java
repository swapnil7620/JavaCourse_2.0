package com.Java8_ByTelusko;

import java.util.Arrays;
import java.util.List;

public class StreamAPI3 {
	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(10, 20, 30, 40, 50);

		// This concept is know as Method reference
		 data.forEach(System.out::print);
		data.forEach(StreamAPI3::doubleValue);
	}	
	public static void doubleValue(int i) {
		
		System.out.println(i*2);
	}
}
