package com.Java8_ByTelusko;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class StreamAPI2 {

	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(10, 20, 30, 40, 50);
		
		// list_Iterator is help to move in both direction 
		ListIterator<Integer> values = data.listIterator();
		
		while(values.hasNext()) {
			System.out.print(values.next() + " ");
		}
		System.out.println("");
		while (values.hasPrevious()) {
			
			if (values.previous()==30) {
				System.out.println("i found "+values.next() + " at index " + values.previousIndex());
				break;
			}
			System.out.print(values.previous()+" " );
			
		}

//		data.forEach(i -> System.out.print(i + " "));
//		 printing a value using method reference (::);
//		data.forEach(System.out::println);
	}
}
