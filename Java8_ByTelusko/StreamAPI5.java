package com.Java8_ByTelusko;

import java.util.Arrays;
import java.util.List;

public class StreamAPI5 {

	public static void main(String[] args) {
		
//		List<Integer> list = Arrays.asList(100,200,500,250,111,234,233);
		List<Integer> list = Arrays.asList(100,200,500,33);
//		list.forEach(i -> System.out.print(i+" "));
		System.out.println(
				list.stream().
				filter(i-> i%2!=0).
				map(i -> i*2).toList()) ;
  /*
		list.stream().
		filter(i-> i>=220).
		forEach(i -> System.out.print(i+" "));
		*/
		System.out.println(list.stream().
				                   filter(i-> i>300).
				                   map(i->i*2).
				                   reduce(0,(c,e)-> c+e));
		
		System.out.println(list.stream().
				                  filter(i-> i % 5 == 0).
				                  map(i-> i*3).
				                  findFirst().
				                  orElse(0));
		
		
		
	}
}
