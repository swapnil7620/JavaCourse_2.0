package com.ExceptionHandling;

public class Exception3 {

	public static void Division()  {
		
		System.out.println(10 / 0);
		System.out.println("hi");
		throw new ArithmeticException("throw  from Divison Method");
	}

	public static void main(String[] args)  {
				try {
			
		   Division();
		} catch (Exception e) {
//			  System.out.println("Exception caught: Division by zero is not allowed!");
			  System.out.println(e);
		}

		

		
		
	}

}
