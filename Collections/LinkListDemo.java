package com.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
	
		LinkedList<Employee> employees =new LinkedList<Employee>();
		
		employees.add(new Employee(1, "Swapnil", 10000));
		employees.add(new Employee(2, "Niraj", 20000));
		employees.add(new Employee(3, "Suyog", 30000));
		employees.add(new Employee(4, "Nishnat", 40000));
		employees.add(new Employee(5, "Pavan", 50000));
		
		
		// using normal Loop
		
		/*
		for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i));
			
		}
		*/
		// using enhance loop
		
		/*
	    for (Employee employee : employees) {
	    	System.out.println(employee);
			
		}
		*/
	    
	    // enhance loop using  iterator 
	    
	    Iterator<Employee> itr = employees.iterator();
	  	  while(itr.hasNext() ) {
	  		  System.out.println(itr.next());
	  		  
	   
	}

}

}
