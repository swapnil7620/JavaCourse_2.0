package com.DemoOfInheritance;

import java.net.DatagramSocket;
import java.util.Iterator;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class Demo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * System.out.println("Enter the String"); String original = scanner.nextLine();
		 * 
		 * 
		 * String reversed = new StringBuilder(original).reverse().toString();
		 * 
		 * if (reversed.equalsIgnoreCase(original)) {
		 * System.out.println("Both String Are Equal"); } else {
		 * System.out.println(" Both String is not equal");
		 * 
		 * }
		 */

		
		
		/*
		        String reversed = "ABCBA";
		        boolean isSame = true;

		        for (int i = 0; i < reversed.length(); i++) {
		            if (reversed.charAt(i) != reversed.charAt(reversed.length() - 1 - i)) {
		                isSame = false;
		                break;
		            }
		        }

		        if (isSame) {
		            System.out.println("String is same.");
		        } else {
		            System.out.println("String is not same.");
		        }
		        */
		
		

		/*
		String name = "SwapnilKishorMahajan";
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch : name.toCharArray()) {
        	
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
           
        }

        System.out.println(charCount);
        
        
		    }
		    */
		
		
		String name = "SwapnilKishorMahajan";
        HashMap<Character, Integer> charFirstOccurrence = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            charFirstOccurrence.putIfAbsent(ch, i);
        }

        System.out.println("First occurrence of each character: " + charFirstOccurrence);
        for (int i = 0; i < name.length(); i++) {
        	/// checked  the occurrence of first repeated element
        	
//        if(	charFirstOccurrence.containsValue());
			
		}

  
        char firstChar = name.charAt(0);
        System.out.println("First occurrence of '" + firstChar + "': " + charFirstOccurrence.get(firstChar));
    }
		

}


