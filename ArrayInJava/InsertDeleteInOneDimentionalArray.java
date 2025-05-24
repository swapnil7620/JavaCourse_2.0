package com.ArrayInJava;

import java.util.Scanner;

public class InsertDeleteInOneDimentionalArray {

	public static void main(String[] args) {
		/*
		
		int size;
	    System.out.println( "Enter the array size (excluding the extra element you will add) :\n");
	    
	    
	  
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int Size = scanner.nextInt();
	
	    
		
		int[] arr = new int[Size+1];
	    
	     System.out.println("Enter the Element of array");
		  for (int i = 0; i < Size; i++) {
			  	  arr[i]= scanner.nextInt();
			
		}
		  System.out.println("Enter the element to add\n");
		   int elementToADD = scanner.nextInt();
		   System.out.println("Enter the index at which you want to insert the element (0 to ):\n");
		     int InsertIndex = scanner.nextInt();
		   
	    // Shift elements to the right to make space for the new element
	    for (int i = Size; i > 0; i--)
	    {
	        if (i > InsertIndex)
	        {
	            arr[i] = arr[i - 1];
	        }      
	    }
	    arr[InsertIndex] = elementToADD;
	    Size++; // Increase the size of the array after insertion
	    
	    System.out.println("\nThe array after insertion :");
	    for (int i = 0; i < Size; i++)
	    {
	        System.out.println(arr[i]);
	    }
	    
	    */
		// Deleting the element from an array
		System.out.println("Enter the size of an array");
		Scanner scanner = new Scanner(System.in);
		int Size = scanner.nextInt();
	    int[] arr = new int[Size];
	    
	   System.out.println("Enter the Element of array");
		  for (int i = 0; i < Size; i++) {
			  	  arr[i]= scanner.nextInt();
			
		}
		  
		  System.out.println("\nThe array Before deletion :\n");
		    for (int i = 0; i < Size; i++)
		    {
		        System.out.println(arr[i]);
		    }
		    
		  
		  int delete_index;
		  System.out.println("Enter the index of the element you want to delete (0 to " + (Size -1) + "):");
		   delete_index =  scanner.nextInt();		    
		    // Shift elements to the left to remove the specified element
		   for (int i = delete_index; i < Size - 1; i++) {
			    arr[i] = arr[i + 1]; // Shift elements safely to avoid out-of-bounds error
			}
			Size--; // Reduce logical size after shifting elements

		   System.out.println("\nThe array after deletion :\n");
		    for (int i = 0; i < Size; i++)
		    {
		        System.out.println(arr[i]);
		    }
		    
		  
	scanner.close();
	}

}
