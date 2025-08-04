package com.Java8_ByTelusko;

import java.util.Arrays;
import java.util.List;

public class StreamAPI4 {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(10,20,30,40,50,60,55,65,-80);
		
		// c means carry , e means values
//		System.out.println(values.stream().map(i->i*2).reduce(0, (c,e) ->c+e));
		
		// Using Integer Class
		System.out.println(" " + values.stream().map(i->i*2).reduce(0, (c,e) -> Integer.sum(c, e)));
		System.out.println(" " + values.stream().map(i->i*2).reduce(0, (c,e) -> Integer.max(c, e)));
		System.out.println(" " + values.stream().map(i->i*2).reduce(0, (c,e) -> Integer.min(c, e)));
		System.out.println(" " + values.stream().map(i->i*2).reduce(0, (c,e) -> Integer.MIN_VALUE));
		
		// Without using carry (c) and value (e)
		System.out.println(" " + values.stream().map(i->i*2).reduce(0 ,Integer::sum));
	        
//		values.stream()
//		.filter(i -> i % 2 !=0)
//		.forEach(System.out::println);
//		
//	System.out.println(values.stream().findFirst());
   values.stream().unordered().forEach(i ->System.out.print(i+" "));
		
		
	}
}
