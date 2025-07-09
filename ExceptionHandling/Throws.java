package com.ExceptionHandling;


public class Throws {
	
	public static void ageValidator(int age) throws Exception {
		
		if (age <= 0 || age > 80) {
			 
			throw new Exception();
		}
		else {
			System.out.println("Age is valid for vote : "+age);
			
		}
	}
	public static void Method(int age) throws Exception {
		
		ageValidator(age);
	}

	public static void main(String[] args) {
		int age = 0;
		
		try {
			
			Method(age);
		} catch (Exception e) {
			System.out.println("invalid Age ");
			
		}
	}

}
