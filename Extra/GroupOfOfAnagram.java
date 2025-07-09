package com.Extra;

import java.util.Arrays;
import java.util.Scanner;

public class GroupOfOfAnagram {

	public static void main(String[] args) {
		
		 String[] words = {"eat", "tea","tan", "ate", "nat", "bat"};
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a word: ");
	        String input = sc.nextLine();

	        boolean found = false;

	        for (String word : words) {
	            if (isAnagram(word, input)) {
	                System.out.println(input + " is an anagram of: " + word);
	                found = true;
	            }
	        }

	        if (!found) {
	            System.out.println("No anagram found for: " + input);
	        }
	        
	        sc.close();
	    }

	    
	    public static boolean isAnagram(String s1, String s2) {
	        char[] a = s1.toCharArray();
	        char[] b = s2.toCharArray();
	        Arrays.sort(a);
	        Arrays.sort(b);
	        return Arrays.equals(a, b);
	
}
}

//
//[tea,ate,eat]
//		
//		[tan,nat]
//				[bat]