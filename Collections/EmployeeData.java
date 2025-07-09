package com.Collections;

public class EmployeeData {
	
	
	int id;
	String EmployeeName;
	double Salary;
	
	public EmployeeData(int id,	String EmployeeName,double Salary) {
		
		this.id=id;
		this.EmployeeName=EmployeeName;
		this.Salary= Salary;
		
	}

	@Override
	public String toString() {
		return "EmployeeData [id=" + id + ", EmployeeName=" + EmployeeName + ", Salary=" + Salary + "]";
	}

}
