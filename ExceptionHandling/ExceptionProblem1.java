package com.ExceptionHandling;




import java.util.Scanner;

public class ExceptionProblem1 {

	public static void main(String[] args) {

		int number1;
		int number2;
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number 1");
		number1 = scanner.nextInt();
		System.out.println("Enter Number 1");
		number2 = scanner.nextInt();
		System.out.println("Enter Arrya size");
		size = scanner.nextInt();

		int[] arrays = new int[size];
		System.out.println("Enter the arrya element");
		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = scanner.nextInt();

		}
		try {
			
			try {
              System.out.println("Number at index 2 "+arrays[0]);
				
			} catch (Exception e) {
				System.out.println(e);

			}
			if (number2 <= 0) {
				throw new ArithmeticException();

			}

			else {

				System.out.println("Division is : "+number1 / number2);
			}

		} catch (Exception e) {

			System.out.println(e);

		}
		scanner.close();
	}

}
