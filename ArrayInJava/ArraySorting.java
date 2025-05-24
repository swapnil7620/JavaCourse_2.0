package com.ArrayInJava;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int[] arr = new int[size];

		int temp;
		System.out.println("Enter the Element of array");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();

		}

		System.out.println("Sort the array in ascending order");
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j]; // 20
					arr[j] = arr[j + 1];// 10
					arr[j + 1] = temp; // 20

				}
			}

		}
		System.out.print("The Element of array are after sorting in ascending order are : = ");

		for (int i = 0; i < size; i++) {

			System.out.print(arr[i] + " ");

		}
		System.out.println();
		System.out.println("Sort the array in descending order");
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j]; // 20
					arr[j] = arr[j + 1];// 10
					arr[j + 1] = temp; // 20

				}
			}

		}
		System.out.print("The Element of array after sorting in descending order are : = ");

		for (int i = 0; i < size; i++) {

			System.out.print(arr[i] + " ");

		}
		scanner.close();

	}
}
