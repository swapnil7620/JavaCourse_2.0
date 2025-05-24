package com.ArrayInJava;

import java.util.Scanner;

public class SumOfOneDimentionalArray {

	public static void main(String[] args) {
		int Sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = scanner.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the Element of array");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();

		}

		for (int i = 0; i < n; i++) {
			Sum += arr[i];

		}

		System.out.println("Sum of Array is :" + Sum);
		scanner.close();
	}

}
