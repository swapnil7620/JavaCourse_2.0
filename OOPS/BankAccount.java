package com.OOPS;

import java.util.Scanner;

class Customer {

	private int CustomerId;
	private String customerName;
	private int Balance;
	private int creditAmount;
	private int DebitAmount;
	private int Choice; 
    static private String CustomerCity="Chalisgaon";
	

	public int getChoice() {
		return Choice;
	}

	public void setChoice(int choice) {
		Choice = choice;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", customerName=" + customerName + ", Balance=" + Balance
				+ ", creditAmount=" + creditAmount + ", DebitAmount=" + DebitAmount + ", Choice=" + Choice
				+ ", CustomerCity=" + CustomerCity + "]";
	}

	public void Debit(Scanner scanner) throws ArithmeticException {

		System.out.println("Enter the Debit Amount");
		DebitAmount = scanner.nextInt();
		
		if (Balance >= DebitAmount) {

			Balance = Balance - DebitAmount;
//			System.out.println("Balance After debit : " + Balance);
		} 
		
		else {
//			System.out.println("Insufficient Balance");
			
			throw new ArithmeticException();
		}
		

	}

	public void Credit(Scanner scanner) {
		
		System.out.println("Enter the Credit Amount");
        creditAmount = scanner.nextInt(); 
		Balance = Balance + creditAmount;
//		System.out.println("Balance After credit : " + Balance);
	}

	public void Display() {
		
		System.out.println("Customer ID : " + CustomerId);
		System.out.println("cutomer Name : " + customerName );
		System.out.println("Customer Balance : " + Balance);
		System.out.println("Customer City : " + CustomerCity);
	}
}


public class BankAccount {
	
	public static void main(String[] args) {
		int choice ;

		Scanner scanner = new Scanner(System.in);

		Customer customer = new Customer();
		customer.setCustomerId(101);
		customer.setCustomerName("Swapnil");
		customer.setBalance(10000);
//		customer.setChoice(1);

//		System.out.println("Customer ID : " + customer.getCustomerId());
//		System.out.println(" Customer Name : " + customer.getCustomerName());
//		System.out.println("Customer Balance : " + customer.getBalance());
//		System.out.println("Choice : "+ customer.getChoice());
		
		System.out.println("Enter the Choice : ");
		
		choice = scanner.nextInt();
		if (choice == 1) {
			customer.Credit(scanner);
			System.out.println("Customer ID : " + customer.getCustomerId());
			System.out.println("cutomer Name : " + customer.getCustomerName());
			System.out.println("Customer Balance : " + customer.getBalance());

		}
		else if(choice ==2) {
			try {
				customer.Debit(scanner);
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Invalid balance");
			}
			
			System.out.println("Customer ID : " + customer.getCustomerId());
			System.out.println("cutomer Name : " + customer.getCustomerName());
			System.out.println("Customer Balance : " + customer.getBalance());

		}
		else if(choice ==3) {
			customer.Display();
//			System.out.println("Customer ID : " + customer.getCustomerId());
//			System.out.println("cutomer Name : " + customer.getCustomerName());
//			System.out.println("Customer Balance : " + customer.getBalance());
//			System.out.println("Customer City : " + customer.CustomerCity);
		}
		else {
			
			System.out.println("Invalid Option");
		}
		scanner.close();
	}
	


}
