package com.ExceptionHandling;

public class BankAccount {
	
	private double balance ;
	
	public BankAccount( double balance)
	{
		this.balance = balance;
	}
	
	public void withdraw(double amt )throws InsufficientBalance
	{
		if (amt > this.balance) {
			throw new InsufficientBalance("Insuffient Funds ");
		}
		
		this.balance -= amt;
		System.out.println("The Withdrawal Is completed ...! ");
	}
	
	public double getBalance()
	{
		return this.balance;
	}
}
