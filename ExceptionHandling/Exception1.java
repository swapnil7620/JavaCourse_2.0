package com.ExceptionHandling;

public class Exception1 {

	public static void main(String[] args)  {
 
		int x = 10;
		int y = 0;

		try {

			
			System.out.println(x / y);

//			if (y > 0) 
//			{
//				
//			} 
//			else
//			{
//				throw new ArithmeticException("Cannot divide by zero");
//			}
//
		}

		catch (ArithmeticException e) 
		{

//			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		} 
		
		finally 
		{
			System.out.println("Transaction is completed.....");
		}

	}

}
