package com.Basic;

public class MenuDrivenAddSum {

	public static void main(String[] args) {

		int Number1, Number2, Operation;

		System.out.println("Enter the numbers\n");

		Number1 = 10;
		Number2 = 20;

		System.out.println(
				"Enter the operation (1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division)\n");

		Operation = 1;

		if (Operation == 1) {
			int Add = Number1 + Number2;
			System.out.println("Addition of Number1 = (" + Number1 + ") and Number2 =(" + Number2 + ") = " + Add);
		} else if (Operation == 2) {
			int Sub = Number1 - Number2;
			System.out.println("Subtraction of Number1= (" + Number1 + ") and Number2= (" + Number2 + ") = " + Sub);
		} else if (Operation == 3) {
			int Mul = Number1 * Number2;
			System.out.println("Multiplication of Number1 =(" + Number1 + ") and Number2 =(" + Number2 + ") = " + Mul);
		} else if (Operation == 4) {
			if (Number2 != 0) {
				int Div = Number1 / Number2;
				System.out.println("Division of Number1 and Number2 =" + Div);
			} else {
				System.out.println("Division by zero is not allowed");
			}
		} else {
			System.out.println("Invalid operation\n");
		}

	}

}
