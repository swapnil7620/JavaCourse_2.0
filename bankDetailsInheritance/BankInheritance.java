package com.bankDetailsInheritance;

public class BankInheritance {

	public static void main(String[] args) {

		int choice;
		choice =2;
		switch (choice) {
		case 1:
			Account account = new Account();
			
			account.setBankID(1001);
			account.setBankName("Central Bank of India");
			account.setAccountType("Saving");
			account.setAccountNumber(123456789);
			account.setBalance(20000);
			account.setBranchName("Chalisgaon");
			
			System.out.println("------ Account  Details  ------- ");
			System.out.println("Bank Id :"+account.getBankID());
			System.out.println("Bank Name :"+account.getBankName());
			System.out.println("Bank Account Type :"+account.getAccountType());
			System.out.println("Bank Account Number :"+account.getAccountNumber());
			System.out.println("Bank Balance :"+account.getBalance());
			System.out.println("Bank branch Name :"+account.getBranchName());
			
	        
			
			System.out.println("\n ---- End Of Bank Details ---------- \n");
			
			break;
			
		case 2:
			System.out.println("\n ------- Manager Details -------- \n ");
			
			Manager manager = new Manager();
			manager.setBankID(10001);
			manager.setBankName("central Bank of india");
			manager.setManageName("Swapnil");

			
		     System.out.println("Bank ID : "+ manager.getBankID());
		     System.out.println("Bank Name : "+ manager.getBankName());
		     System.out.println("Bank Manager Name : "+ manager.getManageName());
		     
		     
		     System.out.println("--------------- End of Manager  Details ---------");

			break;
		case 3:
			 System.out.println("\n-----------Saving Account Details-----------\n");
		     SavingAccount savingAccount = new SavingAccount();
		     savingAccount.setBankID(10001);
		     savingAccount.setBankName("Central Bank of india");
		     savingAccount.setBranchName("Chalisgaon");
		     savingAccount.setManageName("Abhijeet");
		     savingAccount.setAccountNumber(123456789);
		     savingAccount.setAccountHolderName("Swapnil Mahajan");
		     savingAccount.setAccountType("Saving");
		     savingAccount.setIntersetRate(7.50f);
		     savingAccount.setWithdrawalLimit(1000000);
		     savingAccount.setBalance(3000000);
		     		
				System.out.println("Bank ID :"+savingAccount.getBankID());
				System.out.println("Bank Name: " + savingAccount.getBankName());
		        System.out.println("Branch Name: " + savingAccount.getBranchName());
		        System.out.println("Manager Name: " + savingAccount.getManageName());
		        System.out.println("Account Number: " + savingAccount.getAccountNumber());
		        System.out.println("Account Holder Name: " + savingAccount.getAccountHolderName());
		        System.out.println("Account Type: " + savingAccount.getAccountType());
		        System.out.println("Account Balance: " + savingAccount.getBalance());
		        System.out.println("Interest Rate: " + savingAccount.getIntersetRate());
		        System.out.println("Withdrawal Limit: " + savingAccount.getWithdrawalLimit());
		        
		        System.out.println("\n ------------- End of Saving Details-----------\n"); 
		      	    
			break;
			
		case 4:
			System.out.println("\n------------Current Account Details---------\n");
			
			  CurrentAccount currentAccount = new CurrentAccount();
		      currentAccount.setBankID(20001);
		      currentAccount.setBankName("Central Bank of India");
		      currentAccount.setBranchName("Chalisgaon");
		      currentAccount.setManageName("Abhijeet");
		      currentAccount.setAccountNumber(123456789);
		      currentAccount.setAccountHolderName("Rahul Deshmukh");
		      currentAccount.setBalance(3000000);
		      currentAccount.setAccountType("Current");
		      currentAccount.setMinimumBalance(2000000);
		      
		      System.out.println("Bank Name: " + currentAccount.getBankName());
		      System.out.println("Branch Name: " + currentAccount.getBranchName());
		      System.out.println("Manager Name: " + currentAccount.getManageName());
		      System.out.println("Account Number: " + currentAccount.getAccountNumber());
		      System.out.println("Account Holder Name: " + currentAccount.getAccountHolderName());
		      System.out.println("Acount Balance :"+currentAccount.getBalance());
		      System.out.println("Account Type: " + currentAccount.getAccountType());
		      System.out.println("Account Minimum balance required :" +currentAccount.getMinimumBalance());
			break;

		default:
			System.out.println("Invalid Choice");
			break;
		}
		  
	  
	  
  }
	  
	}
	


