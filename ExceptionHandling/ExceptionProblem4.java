package com.ExceptionHandling;


import java.util.Scanner;

public class ExceptionProblem4 {

	public static void main(String[] args) {

		int balance = 10000;
		int debitAmount;
		int choice;

		Scanner scanner = new Scanner(System.in);
//		System.out.println("Balance");
//		balance = scanner .nextInt();
//		System.out.println("Enter the Debit Amount");
//		debitAmount = scanner.nextInt();

		do {
			System.out.println("Enter the Debit Amount");
			debitAmount = scanner.nextInt();
			try {

				if (debitAmount <= balance ) {

					balance = balance - debitAmount;
					System.out.println("current balance is : " + balance);
				} else {
					throw new ArithmeticException("Invalid Amount");
				}
			} catch (Exception e) {
				System.out.println("Current balance :"+balance);
				System.out.println("Enter the valid Amount");
			
			}
			
			System.out.println("Enter the choice 1: for exist  2 : continue " );
			choice = scanner .nextInt();
						
		} while (choice == 2 );
		 System.out.println("\n Thank you ");
	        scanner.close(); 
		}

	}


