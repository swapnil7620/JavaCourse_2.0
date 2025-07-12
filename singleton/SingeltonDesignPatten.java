package com.singleton;

public class SingeltonDesignPatten {

	public static void main(String[] args) {
		
		
		// we cannot create object because constructor is private 
       //  Logger logger = new Logger();
		
	Logger logger1 =	Logger.getInstance();
	Logger logger2 =	Logger.getInstance();
	
	
	System.out.println("The looger 1 and Logger are "+ (logger1 == logger2));
	}

}
   