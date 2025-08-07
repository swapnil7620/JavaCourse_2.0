package com.Java8_ByTelusko;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practical {

	public static void main(String[] args) {
		
		List<String> userList = Arrays.asList("Swapnil_Mahajana",
				"Vikrant_Mahajan",
				"Nishnat_Deskmukh",
				"Suyog_Chaudhari",
				"Dhanraj_Tikhat");
			
	 List<String> fiList =	userList.parallelStream().filter(value ->
		value.toLowerCase().
		contains("mahajan")).
		collect(Collectors.toList());
		
		System.out.println(fiList);
		
		
    List<Integer> marks = Arrays.asList(330,300,400,600,549,234,356) ;
    //420 350 620 376 569 
    //420 569 350 376 620 
    marks.parallelStream().filter(i-> i >=320).
                           map(i -> i+20).
                           forEach(i -> System.out.print(i+" "));
                           
	}
}
