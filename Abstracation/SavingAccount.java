package com.Abstracation;

public class SavingAccount extends BankAccount {

	protected Double Interest;

	public void CreditInterset() {
		
		Balance = Balance + Balance * Interest / 100;
		System.out.println("After credit interest balance is :"+this.Balance);

	}

	public void DebitInterset() {
		Balance = Balance - (amount * Interest / 100);
		System.out.println("After debit interest balance is :"+this.Balance);


	}

}
