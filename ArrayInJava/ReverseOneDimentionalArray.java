package com.ArrayInJava;

import java.util.Scanner;


public class ReverseOneDimentionalArray {

	
	public static void main(String[] args) {

		int Start, End , Temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array 'Array size must be greater than ' : 1 ");
		int Size = scanner.nextInt();
		int[] arr = new int[Size];
		
		System.out.println("Enter the Element of array");
	  for (int i = 0; i < Size ; i++) {
		  	  arr[i]= scanner.nextInt();
		
	}
	  
	 Start = 0;
	 End = Size - 1 ;
	 Temp = Start;
	 
	    while(Start < End)
	    {
		 Temp = arr[Start];
		 arr[Start] = arr[End];
		 arr[End]= Temp;
		 Start++;
		 End--;
		
	     }
	 
	 System.out.println("After Reversing the Array");
	 
	 for (int i = 0; i < Size ; i++) {
		 System.out.println(arr[i]);
		
	}
	 scanner.close();
	}

}
