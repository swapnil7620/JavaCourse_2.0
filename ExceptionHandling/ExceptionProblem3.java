package com.ExceptionHandling;

import java.util.Scanner;

public class ExceptionProblem3 {

	public static void main(String[] args) {
	
		int Numarator;
		int Denominator;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Numarator");
		Numarator = scanner .nextInt();
		
		do {
			System.out.println("Enter the Denomarator");
			  Denominator = scanner.nextInt();
			try {
				if (Denominator >=0) {
					System.out.println("Divison is : "+(Numarator/Denominator));
					
				}
				else {
					throw new ArithmeticException();
				}
				
			} 	
			catch (Exception e) {
				System.out.println("denomenator cannot be zero");
			}
			 
			
		}while(Denominator == 0);
		scanner.close();
		

	}

}
