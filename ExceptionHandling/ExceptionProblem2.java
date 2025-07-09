package com.ExceptionHandling;

import java.util.Scanner;

public class ExceptionProblem2 {

	public static void main(String[] args) {

		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size ");
		size = scanner.nextInt();
		System.out.println("Enter the arrays element");

		int[] arrays = new int[size];

		for (int i = 0; i < arrays.length; i++) {
			System.out.print(i + ":");
			arrays[i] = scanner.nextInt();

		}

		for (int i = 0; i < arrays.length; i++) {
			try {

				if (arrays[i] > 0) {

					System.out.println("After  dividing value " +   100 /arrays[i]);

				}

				else {

					throw new ArithmeticException();
				}
			} catch (Exception e) {
//				System.out.println(e);
				System.out.println("value present at index "+ i + " is zero and we Cannot divide to zero");
			}

		}
		scanner.close();
	}
}
