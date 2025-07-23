package com.Java8_ByTelusko;

import java.util.Arrays;
import java.util.List;

public class StreamAPI4 {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(10,20,30,40,50,60,55,65);
		
		// c means carry , e means values
		System.out.println(values.stream().map(i->i*2).reduce(0, (c,e) ->c+e));
	        
		values.stream()
		.filter(i -> i % 2 !=0)
		.forEach(System.out::println);
		
		
	}
}
