package com.Collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {


		
		Stack<String> stack = new Stack<String>();
		
		
		// To push the element in stack
		stack.push("Swapnil");
		stack.push("Nishant");
		stack.push("Suyog");
		stack.push("Niraj");
		stack.push("Pavan");
		
		
		stack.push(null);
		stack.push(null);
		
		// Stack accept Null Values
		
		
		// Printing an Element using Loop
		/*
		for (String S : stack) {
			System.out.println(S);
			
		}
		*/
		
		stack.push(null);// it does not accept null
		
		// Pop the Element from stack	
		stack.pop();
		System.out.println("Elements after perfroming pop operation " +stack);
		
		stack.addFirst("Vaibhav");// ? Doesn't it violate the stack property
		stack.pop();
		System.out.println(stack);
		
		// To see which element is present at top of the stack
		stack.peek();
		System.out.println("Element persent At top of the stack : "+stack.peek());
		
		// To remove all the elements from stack
	   //  stack.clear();
	    System.out.println(stack);
	
	    
	 // To Check the capacity 
	    System.out.println("To Check the capacity  : "+stack.capacity());
	    
	 // To check the size
	    System.out.println(" To check the size "+stack.size());  
	    
	 // To find the element is present in stack or not and its vector method"  
	    System.out.println(stack.contains("To find the element is present in stack : "+"Swapnil")); 
	    
	 // To find the Element present at specific index index
	    System.out.println("To find the Element present at specific index index : "+stack.elementAt(2));
	    
	 // This method present in stack  to check weather stack is empty or not
	    System.out.println(stack.empty()); 
	    
	 // This method is present in vector to check weather stack is empty or not
	    System.out.println(stack.isEmpty());
	    
    //  To find the element present at which index
	    System.out.println(stack.search("Nishant"));
	    
	
	
	}

}
