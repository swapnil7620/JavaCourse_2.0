package com.Multithreading;


class CashWithdraw extends Thread {
	Account account;
	int amount;

	public CashWithdraw(Account account, int amount) {
		this.account = account;
		this.amount = amount;
	}

	public void run() {
		account.withdraw(amount);
	}
}

class Cashdeposite extends Thread {
	Account account;
	int amount;

	public Cashdeposite(Account account, int amount) {
		this.account = account;
		this.amount = amount;
	}

	public void run() {
		account.deposit(amount);
	}
}

public class MultithreadingDemo {
	public static void main(String[] args) {

		Account account = new Account(20000);

		CashWithdraw cWithdraw = new CashWithdraw(account, 30000);
		Cashdeposite cDeposite = new Cashdeposite(account, 50000);

		cWithdraw.setName("Thread-Withdraw");
		cDeposite.setName("Thread-Deposite ");

		cWithdraw.start();
		cDeposite.start();

	}
}




	