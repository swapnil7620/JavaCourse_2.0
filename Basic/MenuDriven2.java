package com.Basic;

public class MenuDriven2 {
	
	public static void main(String[]args ) {
		
		int balance, credit, debit, choice;
		   balance = 1000;
		   
		   
		  System.out.println("--------MENU---------\n ");
		  System.out.println(" 0 )  for debit amount \n ");
		  System.out.println(" 1 )  for credit amount \n ");
		  System.out.println (" 2 )  for View amount (balance) \n ");

		  System.out.println("Enter the Choice\n");
		   choice = 0;
		System.out.println("After enter the Choice\n");

		   if (choice == 0)
		   {
                System.out.println("Enter the debit Amount\n");
		        debit = 500;
		      if (debit <= balance)
		      {
		         balance = balance - debit;
		         System.out.println(" After the debit balance is "+ balance);
		      }
		      else
		      {
		    	  System.out.println("insufficent balance ");
		    	  System.out.println("You don't have a lot of money ");
		      }
		   }
		      else if(choice == 1) {
			   System.out.println("Enter the Credit Amount\n");
		      credit = 2000;
		      balance = balance + credit;
		      System.out.println(" After the credit balance is = " +balance);
		     
		      }
		      else if (choice == 3) {
			   System.out.println(" Current balance is = "+ balance);
		      }
		      else{
			   System.out.println("Invalid choice");
		   }

	}

}
