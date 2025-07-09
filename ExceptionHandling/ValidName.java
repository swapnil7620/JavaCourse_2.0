package com.ExceptionHandling;

public class ValidName {

	public static void main(String[] args) {
	
		User user = new User("12345");
		
		try {
			user.ShortName("Swapnil");
		} catch (TooShortNameException e) {
			
			System.out.println(e);
		}

	}

}
