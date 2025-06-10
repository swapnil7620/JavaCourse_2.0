package com.OOPS;

// Fully Encapsulation class
// In advance java this is  a bean class
class Employee

{
	private int id;
	private String empName;
	private int Salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", Salary=" + Salary + "]";
	}
	
	
}
public class GetterAndSetter {

	public static void main(String[] args) {
	   Employee employee = new Employee();
//	   System.out.println(employee);

		
		// To set the value from data member
	   
	   employee.setId(10);
	   employee.setEmpName("Ross");
	   employee.setSalary(20000);
	   
	   // To get the value form data member
	   System.out.println(employee.getId());
	   System.out.println(employee.getEmpName());
	   System.out.println(employee.getSalary());
	   
	   // String representation of object
	   System.out.println(employee.toString());
	   
	}
	

}
