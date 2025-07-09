package com.ExceptionHandling;

//import java.util.*;

public class Exceptional {

	public static void main(String[] args) {

		String Mail = "Swapnil7620@gmail.com";
		String Password = "Pass123";
		
		
		String Mail1 = "Swapnil7620@gmail.com";
		String PassWord1 = "Pass1213";

		try 
		{

			if (Mail1.equals(Mail) && PassWord1.equals(Password)) 
			{
				System.out.println("Password is match"); 
				System.out.println("Welcome to the our Websitex....");
			}
				else 
				{
					throw new ArithmeticException( "invalid ");
				}
			}
			
		catch (ArithmeticException e) {
			
			System.out.println(e.getMessage());

			 System.out.println(e.toString());
			 
				e.printStackTrace();
		}
		catch (Exception e) {
			e.getMessage();

		}

	}
}
