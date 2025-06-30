package com.Abstracation;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		int choice;

		SavingAccount savingAccount = new SavingAccount();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Account Number ");
		savingAccount.AccountNumber = scanner.nextInt();

		System.out.println("Enter Holder Name ");
		savingAccount.HolderName = scanner.next();

		System.out.println("Enter the balance ");
		savingAccount.Balance = scanner.nextDouble();

		do {
			System.out.println("Enter the choice : ");
			System.out.println(" 0: Exists 1 : credit  2 : CreditInterest  3 : Debit  4 : DebitInterest");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the Amount ");
				savingAccount.amount = scanner.nextDouble();
				savingAccount.Credit();
				break;
			case 2:
				System.out.println("Enter the Amount ");
				savingAccount.amount = scanner.nextDouble();

				System.out.println("Enter the Interest Rate :");
				savingAccount.Interest = scanner.nextDouble();

				savingAccount.CreditInterset();
				break;

			case 3:
				System.out.println("Enter the Amount ");
				savingAccount.amount = scanner.nextDouble();
				savingAccount.Debit();
				break;
				
			case 4:
				System.out.println("Enter the Amount ");
				savingAccount.amount = scanner.nextDouble();

				System.out.println("Enter the Interset Rate :");
				savingAccount.Interest = scanner.nextDouble();

				savingAccount.DebitInterset();
				break;
			case 0:
				System.out.println("Existed");
				break;
				
			default:
				System.out.println("Invalid choice ");
			}
		} while (choice != 0);

	
		scanner.close();
	}

}
