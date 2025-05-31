
package com.ClassesAndObjects;

import java.util.Scanner;

class StudentDetails {
	private int id;
	private String name;
	private int marks;
	 // static data member of a class 
  // static private String clgName = "NYNC";
  private static  String clgName ;
	
	// Static Block
	
	static {
		clgName="Abcd";
	}
	
	// Static member function
	static public void ChangeName() {
		  clgName="Nync";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	// Default Constructor
	public StudentDetails() {
		this.id = 1;
		this.name = "vaibhav";
		this.marks = 100;
	}
// Parameterize Constructor
	public StudentDetails(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentDetails [id=" + id 
				+ ", name=" + name 
				+ ", marks=" + marks 
				+ ", clgName=" + clgName+"]";
	}
	
}

public class StaticExample {
	public static void main(String[] args) {
		int n, id, marks;
		String name;
		
		StudentDetails.ChangeName();
//		System.out.println(StudentDetails.ChangeName());// 
//		System.out.println(StudentDetails.clgName); // without getter setter we cannot access private variable
		 System.out.println();
		
		System.out.println("Enter the number of Students : = ");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		// array of object
		StudentDetails[] sDetails = new StudentDetails[n];

		System.out.println("-------------- Enter the Details --------------- ");
		for (int i = 0; i < sDetails.length; i++) {
			
			System.out.println("Enter the deatils of Employee : " + (i+1));
			
			System.out.println("Enter the id : = ");
			id = scanner.nextInt();

			System.out.println("Enter the Name: = ");
			name = scanner.next();

			System.out.println("Enter the Marks : = ");
			marks = scanner.nextInt();

			// there are  two ways are here to set the values to array
			// First one is here
		    // sDetails[i] = new StudentDetails(id, name, marks);
			// Second one is here
			sDetails [i] = new StudentDetails();
			sDetails[i].setId(id);
			sDetails[i].setName(name);
			sDetails[i].setMarks(marks);

		}
		
		
		System.out.println("--------------The Student Details are --------------- ");
		for (int i = 0; i < sDetails.length; i++) {

			System.out.println(sDetails[i].toString());

		}
		
		// Default Constructor
		StudentDetails S1 = new StudentDetails();
		System.out.println(S1.toString());
		
		scanner.close();
	}
}
