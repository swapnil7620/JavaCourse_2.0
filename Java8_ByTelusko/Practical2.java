package com.Java8_ByTelusko;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practical2 {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(200, 300, 130, 111, 232, 453, 500, 400, 400);

		// To count the number of values
		System.out.println(values.stream().count());

		// To limit the iteration
		values.stream().filter(i -> i % 2 == 0).limit(3).forEach(i -> System.out.println(i));

		// Another way to print
		System.out.println(values.stream().filter(i -> i % 2 == 0).limit(3).collect(Collectors.toSet()));
		
		values.stream().map(i -> i*2);

	}
}
