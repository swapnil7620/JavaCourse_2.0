package com.singleton;

public class Logger {

 
	// Instance and get instance are must be static
      private static Logger instanceLogger;
 
	private Logger() {
	  System.out.println("Logger is initialise");	
	}

	
	public static Logger getInstance() {
		
		
		if (instanceLogger == null) {
			instanceLogger = new Logger();
			
		}
		return instanceLogger;
	}

	
}
