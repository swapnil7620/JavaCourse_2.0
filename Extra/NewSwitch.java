package com.Extra;


/*
   Switch Expressions was introduced in Java 12,
  but was permanently added in Java in its version 14
  
 */
public class NewSwitch {

	public static void main(String[] args) {
    
		/* 1) Way
		 
		String day = "SUnday".toLowerCase();
		String result ="";

		switch (day) {

		case "saturday", "sunday" -> result ="6 AM";

		case "monday" -> result ="8 AM"; 

		default -> System.out.println("7 AM");  

		}

		System.out.println(result);
		
		*/
		
		
		
		// 1) We can Put this into the Expression as below or
		// 2) when we want to put Switch Case into the Expression 
		
		/*
		 2) Way
		 
		String day = "".toLowerCase();
		String result ="";

        result =	switch (day) {

		case "saturday", "sunday" -> "10 AM";

		case "monday" -> "8 AM"; 

		default -> "Depend Upon Mood..."; 

		};

		System.out.println(result);
		
		*/
		
		// 3) Way And recommended way
		
		// When you want to use Switch case as Expression but you dont't want to use Arroyo(->) key
     	// or you want to use Colon (:)  then below way is useful
		
		String day = "sunday".toLowerCase();
		String result ="";

        result = switch (day) {

		case "saturday", "sunday" : yield "10 AM";

		case "monday" : yield "8 AM"; 

		default  : yield "Depend Upon Mood..."; 

		};

		System.out.println(result);
		
 /*----------------------------------------------------------------------------------------------------------------------*/
		
		// Java 17 & 21 introduced pattern matching enhancements.
		/*
		 With pattern matching, you can now use type patterns directly in switch cases, 
		 eliminating redundant type checks and casts. Would you like a code example to see it in action?
		 */

	     	Object Object = new Object();
		    Object obj = Object ; // Can be any object type

            String result1 = switch (obj) {
            case Integer i -> "It's an Integer with value: " + i;
            case String s -> "It's a String: " + s;
            case Double d -> "It's a Double: " + d;
            // case Object o -> "It's a Object " + o; // Error and it's Cause as Given Below
            /*
             Why does this happen?
             case Object o matches all possible types, since everything in Java is an Object.
             The default case is meant to catch anything not matched by previous cases.
             Since Object already covers everything, the default case becomes redundant and causes a compilation error.
             */
            default -> "Unknown type";
        };

        System.out.println(result1);
	}
}
