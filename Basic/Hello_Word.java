package com.Basic;

public class Hello_Word {

	public static void main(String[] args) {
//		System.out.println("Hello Word......");
		/*
		 * int a= 10;
		 * 
		 * int b =20; int choice = 2;
		 * 
		 * switch(choice){
		 * 
		 * case 1: System.out.println("The addition of a = " + a + ", b = " + b +
		 * " is = " + (a + b));
		 * 
		 * break;
		 * 
		 * case 2 : System.out.println("The Substraction of a = " + a + ", b = " + b +
		 * " is = " + (a - b));
		 * 
		 * break;
		 * 
		 * case 3 : System.out.println("The multiplication of a = " + a + ", b = " + b +
		 * " is = " + (a * b)); break;
		 * 
		 * 
		 * case 4 : System.out.println("The Division of a = " + a + ", b = " + b +
		 * " is = " + (a / b)); break; }
		 * 
		 */
		
		

		int a = 10;
		int b = 20;
		int choice = 5;

		if (choice == 1) {
			System.out.println("The addition of a = " + a + ", b = " + b + " is = " + (a + b));

		}

		else if (choice == 2) {
			System.out.println("The subtraction of a = " + a + ", b = " + b + " is = " + (a - b));

		} else if (choice == 3) {
			System.out.println("The Multiplication of a = " + a + ", b = " + b + " is = " + (a + b));

		} else if (choice == 4) {
			System.out.println("The Divsion of a = " + a + ", b = " + b + " is = " + (a / b));

		} else {
			System.out.println("Enter the Right Choice");
		}
		
	
	}

}
