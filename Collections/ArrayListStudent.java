package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1, "Swapnil",80));
		students.add(new Student(2, "Nishnat",90));
		students.add(new Student(3, "Suyog", 80));
		students.add(new Student(4, "Niraj",70));
		students.add(new Student(5, "Pavan",60));
		
	
		   
  	  Iterator<Student> itr = students.iterator();
  	  while(itr.hasNext() ) {
  		  System.out.println(itr.next());
  		  
	}

}
}
