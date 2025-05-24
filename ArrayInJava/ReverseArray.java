package com.ArrayInJava;

import java.util.Scanner;

class Reverse {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
		int reversedNum = 0;

		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();
		int[] array = new int[n];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		for (int i = 0; i < array.length; i++) {

			int num = array[i];
			while (num > 0) {
				int digit = num % 10;
				reversedNum = reversedNum * 10 + digit;
				num /= 10;
			}

			array[i] = reversedNum;
		}

		// Print the reversed array
		System.out.print("Reversed Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		scanner.close();
	}
}
