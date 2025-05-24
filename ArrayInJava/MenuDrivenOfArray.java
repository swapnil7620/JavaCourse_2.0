package com.ArrayInJava;

import java.util.Scanner;

public class MenuDrivenOfArray {

	public static void main(String[] args) {

		int choice;
		int Start, End, Temp;
		int Min, Max;
		int Sum = 0;
		int delete_index;
	    int elementToADD;
	    int InsertIndex;


		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int Size = scanner.nextInt();
		int[] arr = new int[Size +1];

		System.out.println("Enter the Element of array");
		for (int i = 0; i < Size; i++) {
			arr[i] = scanner.nextInt();

		}
		do {

			System.out.println(" \n ------------Menu--------------\n");
			System.out.println("1 ) For Display Array Element");
			System.out.println("2 ) For Reverse the Array Element");
			System.out.println("3 ) For Min Max of the Array Element");
			System.out.println("4 ) For Sum of an Array Element");
			System.out.println("5 ) For Delete the element from Array ");
			System.out.println("6 ) For Insert the element in Array ");
			System.out.println("Enter the Choice ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:

				System.out.println("The Element of array are : = ");

				for (int i = 0; i < Size; i++) {

					System.out.print(arr[i] + " ");

				}
				break;

			case 2:
				Start = 0;
				End = Size - 1;
				Temp = Start;

				while (Start < End) {
					Temp = arr[Start];
					arr[Start] = arr[End];
					arr[End] = Temp;
					Start++;
					End--;

				}

				System.out.println("After Reversing the Array");

				for (int i = 0; i < Size; i++) {
					System.out.println(arr[i]);

				}
				break;

			case 3:
				Min = arr[0];
				Max = arr[0];

				// Find max
				for (int i = 0; i < Size; i++) {
					if (Max < arr[i]) {
						Max = arr[i];
					}
				}

				// Find Min
				for (int i = 0; i < Size; i++) {
					if (Min > arr[i]) {
						Min = arr[i];
					}
				}

				System.out.println("Max: " + Max);
				System.out.println("Min: " + Min);

				break;

			case 4:
				for (int i = 0; i < Size; i++) {
					Sum += arr[i];

				}
				System.out.println("Sum of Array is :" + Sum);
				break;

			case 5:
				  System.out.println("Enter the index of the element you want to delete (0 to " + (Size -1) + "):");
				   delete_index =  scanner.nextInt();		    
				   for (int i = delete_index; i < Size - 1; i++) {
					    arr[i] = arr[i + 1]; 
					}
					Size--; 

				   System.out.println("\nThe array after deletion :\n");
				    for (int i = 0; i < Size; i++)
				    {
				        System.out.println(arr[i]);
				    }

				break;
				
			case 6:
				System.out.println("Enter the element to add\n");
				    elementToADD = scanner.nextInt();
				   System.out.println("Enter the index at which you want to insert the element (0 to ):\n");
				      InsertIndex = scanner.nextInt();
				   
			    for (int i = Size; i > 0; i--)
			    {
			        if (i > InsertIndex)
			        {
			            arr[i] = arr[i - 1];
			        }      
			    }
			    arr[InsertIndex] = elementToADD;
			    Size++; 
			    
			    System.out.println("\nThe array after insertion :");
			    for (int i = 0; i < Size; i++)
			    {
			        System.out.println(arr[i]);
			    }
			    
				break;
			default:
				System.out.println("Invalid choice !...");
				break;
			}
		} while (choice != 0);
		{
			System.out.println("Existed from program...");
		}
		scanner.close();
	}

}
