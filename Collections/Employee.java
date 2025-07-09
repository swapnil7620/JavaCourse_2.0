package com.Collections;

public class Employee {

	int id ;
	String EmpName;
	double Salary;
	
	public  Employee(int id ,String EmpName,double Salary) {
		this.id=id;
		this.EmpName=EmpName;
		this.Salary= Salary;
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", EmpName=" + EmpName + ", Salary=" + Salary + "]";
	}
	
	
}

