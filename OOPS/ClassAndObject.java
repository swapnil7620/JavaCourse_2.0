package com.OOPS;

// alt + cntl +down // to copy lines 

import java.util.Scanner;

class Student {
	
	// private : access only inside the class
	
   private int id ;
   private String Name;
   private int Age;
   static private String collegeName="NYNC";
	
  public void accept(Scanner scanner) {

		
		System.out.println("Enter the id :");
		id = scanner.nextInt();
		System.out.println("Enter the Name :");
		Name = scanner.next();
		System.out.println("Enter the Age :");
		Age = scanner.nextInt();
		
	}
 public	void Display() {
	 
	 System.out.println("--------Display of Student Details-------");
	 
		System.out.println("Student Id :"+id);
		System.out.println("Student Name :"+" "+ Name);
		System.out.println("Student Age : " +Age);
		System.out.println("Student CollegeName : "+collegeName);
		
	}
@Override
public String toString() {
	return "Student [id=" + id + ","
			+ " Name=" + Name + ", "
			+ "Age=" + Age + ", "
			+ "collegeName=" + collegeName + "]";
}
 
 
}
public class ClassAndObject {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Student student = new Student();
		Student student2 = new Student();
		
		// not accessible
		// System.out.println(Student.id);
		
		student.accept(scanner);
		student2.accept(scanner);
		student.Display();
		student2.Display();
		
	}

}
