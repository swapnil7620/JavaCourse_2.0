package com.Collections;

public class Student {

	
	private int RollNumber;
	private String Name;
	private int Marks;
	
	
	
	public Student(int RollNumber,String Name,int Marks) {
		
		this.RollNumber=RollNumber;
		this.Name= Name;
		this.Marks= Marks;
	}
	@Override
	public String toString() {
		return "Student [RollNumber=" + RollNumber + ", Name=" + Name + ", Marks=" + Marks + "]";
	}
	
	
	
}
