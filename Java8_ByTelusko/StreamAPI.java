package com.Java8_ByTelusko;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPI {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		List<String> values = Arrays.asList("Swapnil","Nishnat","Suyog");

		// All the way we are printing values by using External Iterator
		// because each time we are fetching values from outside thats way its known as
		// a External iterator

		
		// Iterator<String> iterator2=
		  Iterator<Integer> iterator= values.iterator(); 
		  
		  values.iterator();
		  while(iterator.hasNext()) {
		  System.out.print(iterator.next() + " ");
		  }
		  
		  
		  
		  for (int i = 0; i < values.size(); i++) {
		  System.out.print(values.get(i)+" ");
		  
		  }
		  
		  for (Integer integer : values) {
		  
		  System.out.print(integer+" "); }
		 

		// Internal Iteration

		// 1)
		// SAM Interface (Single abstract interface) are also called as functional
		// interfaces
		Consumer<Integer> consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer i) {
//				System.out.print(i+" ");			

			}
		};

		values.forEach(consumer);
		// 2)
		Consumer<Integer> consumer2 = (i) -> {
			System.out.print(i + " ");
		};

		values.forEach(consumer2);

		// 3)
		// -> Arrow = (Lambda Expression)
		values.forEach(i -> System.out.print(i+" "));
		
		

	}

}
