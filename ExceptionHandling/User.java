package com.ExceptionHandling;

public class User {

	private String UserName;
	
	public User(String  UserName) {
		this.UserName= UserName;
	}
   public void ShortName( String UName) throws TooShortNameException {
	   
	   if (UserName.length() > UName.length()) {
		   
		   System.out.println(UName);
		   throw new TooShortNameException("Name is Too short");	
	   }
	   else {
		System.out.println("Your Name is Valid "+UName);
	}
   }
}
