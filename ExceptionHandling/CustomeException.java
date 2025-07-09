package com.ExceptionHandling;

public class CustomeException {

	
public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount(10000);
		
		try 
		{
			bankAccount.withdraw(20000);
		} 
		catch (InsufficientBalance e) 
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("The Current Balance is : = "+bankAccount.getBalance());
		}
		
		
		
	}
}
