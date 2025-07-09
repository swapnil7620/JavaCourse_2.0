package com.Collections;

//import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<EmployeeData> employeeData = new Vector<EmployeeData>();

		employeeData.add(new EmployeeData(1, "Swapnil", 1000));
		employeeData.add(new EmployeeData(2, "Nishnat", 2000));
		employeeData.add(new EmployeeData(3, "Aishwarya", 9000));
		employeeData.addFirst(new EmployeeData(4, "Suyog", 3000));
		employeeData.addLast(new EmployeeData(5, "Himanshu", 7000));

		/*
		 * Iterator<EmployeeData> itr = employeeData.iterator();
		 * 
		 * while (itr.hasNext()) { System.out.println(itr.next());
		 * 
		 * }
		 */

		EmployeeData MinEmployeeData = employeeData.get(0);
		EmployeeData MaxEmployeeData = employeeData.get(0);

		for (EmployeeData employeeData2 : employeeData) {

			if (employeeData2.Salary < MinEmployeeData.Salary) {
				MinEmployeeData = employeeData2;
			}

			if (employeeData2.Salary > MaxEmployeeData.Salary) {
				MaxEmployeeData = employeeData2;
			}
		}

		System.out.println("Min Employee Details " + MinEmployeeData.id + " " + MinEmployeeData.EmployeeName + " "+ MinEmployeeData.Salary);
		System.out.println("Max Employee Details " + MaxEmployeeData.id + " " + MaxEmployeeData.EmployeeName + " "+ MaxEmployeeData.Salary);
	}

}
