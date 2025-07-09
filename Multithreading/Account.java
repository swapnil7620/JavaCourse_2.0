package com.Multithreading;

 public class Account {

	private int balance;

	public Account(int balance) {
		this.balance = balance;
		System.out.println("The Current balance is : = " + this.balance);
	}

	synchronized public void withdraw(int amt) {
		System.out.println(Thread.currentThread().getName()+" Going to Withdraw : = "+amt);
		
		while(this.balance < amt)
		{
			System.out.println("Insufficient Funds ...! ");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.balance -= amt;
		System.out.println("The Amount is Withdrawn : = "+amt);
		System.out.println("The Remaining Balance is : = "+this.balance);
	}

	synchronized public void deposit(int amt) {
		System.out.println(Thread.currentThread().getName()+" Going to Deposit : = "+amt);
		
		this.balance += amt;
		notify();
		System.out.println("The Amount is Deposited : = "+amt);
		System.out.println("The Updated Balance is : = "+this.balance);
	
	}

}
