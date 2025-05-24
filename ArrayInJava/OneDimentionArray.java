package com.ArrayInJava;

import java.util.Scanner;

// Object stored in heap area and reference variable its stored in stack area  
// new keyword is use to create object and its dynamic in nature
public class OneDimentionArray {

	public static void main(String[] args) {
	 // Declaration of array of size 5
//	/*Reference variable(pointer)	-->*/ int []arr = new int[5]; // --> object creation 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the Element of array");
	  for (int i = 0; i < n; i++) {
		  	  arr[i]= scanner.nextInt();
		
	}
	  System.out.println("The Element of array are : = ");

	  for (int i = 0; i < n; i++) {
		  
		  
		  System.out.print(arr[i]+ " ");
		
}
	  scanner.close();
	}

}
