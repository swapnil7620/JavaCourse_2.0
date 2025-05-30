package com.StringClass;

public class StringClass {

	public static void main(String[] args) {
		
		// String Class 
		
//		String string= new String("Swapnil");
//		System.out.println("char At  1 : "+string.charAt(1));
//		System.out.println("conact :"+string.concat(" Mahajan"));
//		System.out.println(""+string.indexOf("S"));
//		System.out.println("To check  weather the tring is empty or not : "+string.isEmpty());
//		System.out.println("To Convert into UpperCase : "+string.toUpperCase());
//		System.out.println("To Convert into LowerCase : "+string.toLowerCase());
//		System.out.println("to replace  the value swapnil with Mahajan "+string.replaceFirst("Swapnil","Mahajan"));
//		
		
		// Equals Method and == Operator
		/*
		String s = "Swapnil"; 
		String string = new String("Swapnil");
		String string1 = new String("Swapnil");
		
		// content Comparison
		
		System.out.println(string.equals(s));
		System.out.println(string.equals(string1));
		
		// Reference comparison
		
		System.out.println(s==string);
		System.out.println(s==string1);
		System.out.println(string==string1);
		*/
		
		// String Buffer class
		/*
		StringBuffer sBuffer =  new StringBuffer("swapnil");
		StringBuffer stringBuffer = new StringBuffer("Swapnil");
		System.out.println("to check the capacity : "+stringBuffer.capacity());
		System.out.println("to Compare the values : "+stringBuffer.compareTo(sBuffer));
		System.out.println("Equals method : "+stringBuffer.equals("Swapnil"));
		System.out.println(" to check the length :"+stringBuffer.length());
		System.out.println("To add the new String (append) method :"+stringBuffer.append(" Mahajan"));
     */
		
		// StringBuilder
		
		StringBuilder stringBuilder = new StringBuilder("Swapnil");
		System.out.println(stringBuilder.substring(2,5));
//		System.out.println(stringBuilder.reverse());
		System.out.println(stringBuilder.codePointAt(3));
		System.out.println(stringBuilder.lastIndexOf("a"));
		System.out.println(stringBuilder.delete(1, 3));
		System.out.println(stringBuilder.repeat("s", 4));
	}
}
