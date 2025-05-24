package com.ArrayInJava;

import java.util.Scanner;

public class ArrayFindMinMax {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array");

		for (int i = 0; i < size; i++) {
		    arr[i] = scanner.nextInt();
		}

		// Initialize Min and max  the array
		int Min = arr[0];
		int Max = arr[0];

		// Find max
		for (int i = 0; i < size; i++) {
		    if (Max < arr[i]) {
		        Max = arr[i];
		    }
		}

		// Find Min
		for (int i = 0; i < size; i++) {
		    if (Min > arr[i]) {
		        Min = arr[i];
		    }
		}

		System.out.println("Max: " + Max);
		System.out.println("Min: " + Min);
scanner.close();
			
	}
	
	

	}


