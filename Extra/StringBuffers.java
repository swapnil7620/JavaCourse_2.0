package com.Extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StringBuffers {

	public static void main(String[] args) {
		
		//  equals operator and method StringBuffer and StringBuilder not overridden equals method for content comparison

		    StringBuffer sb1=new StringBuffer("bhaskar");
	        StringBuffer sb2=new StringBuffer("bhaskar");
	        
//	        System.out.println(sb1==sb2);//false
//	        System.out.println(sb1.equals(sb2));//false
//	        System.out.println(sb1.toString().equals(sb2.toString())); // true (because their content is the same)
	        
	        
	        
	        StringBuilder stringBuilder = new StringBuilder("Swapnil");
	        StringBuilder stringBuilder1 = new StringBuilder("SwaPnil");
//	        System.out.println(stringBuilder.toString().equalsIgnoreCase(stringBuilder1.toString()));
	        
	     

	      
	                ArrayList<char[]> list = new ArrayList<>();

	                String s = "SwapniL";
	                String s1 = "Swapnil";
	                char[] arr = s.toCharArray();
	                char[] arr1 = s1.toCharArray();
	                
	                System.out.println(arr);
	                System.out.println(arr1);

	                list.add(arr); // Storing the entire array in the list
	                list.add(arr1); // Storing the entire array in the list

	              
	                // Printing the stored array
	             
	               String a =  Arrays.toString(list.get(0));
	               String a1 =  Arrays.toString(list.get(0));
	               System.out.println(a);
	               System.out.println(a1);
	               
	               
	               System.out.println(a.equalsIgnoreCase(a1));  
	             
	             
	             int i = 10;
	             Integer integer = 10;
	             System.out.println(integer== (i));
	             
	             Object object = new Object();
	             Object object1 = new Object();
	             
	             object ="Swapnil";
	             object1 ="Swapnil";
	             
	             System.out.println(object.equals(object1));
	             System.out.println(object==(object1));
	             
	             
	            }
	        

	       
	     
	}

