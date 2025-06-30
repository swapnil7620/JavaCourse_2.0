package com.Abstracation;

abstract public class BankAccount {
	
	protected String HolderName;
	protected int AccountNumber;
	protected Double Balance;
	protected	Double amount;
    

	public void Credit() {
		
		Balance = Balance + amount;	
		
		System.out.println(this.HolderName);
		System.out.println(this.AccountNumber);
		System.out.println(this.amount);
		System.out.println(this.Balance);
	}
	public void Debit() {
	
		if (Balance >= amount) {
			Balance = Balance - amount;
			
			System.out.println(this.HolderName);
			System.out.println(this.AccountNumber);
			System.out.println(this.amount);
			System.out.println(this.Balance);
		
		}
		else {
			System.out.println("Balance is low ");
		}
		
	}
  abstract	public void CreditInterset();
  abstract	public void DebitInterset();
}
