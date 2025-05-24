package com.Basic;

public class MenuDriven3 {

	public static void main(String[] args) {
		int n;

		System.out.println("\n\nEnter the Choice (1: Armstrong, 2: Reverse, 3: Palindrome, 4: Factorial, 5: Exit): ");
		n = 1;

		switch (n) {
		case 1: {
			System.out.println(" Number: " + 1);

			int digit, Sum = 0, num = 153, original = num;

			while (num != 0) {
				digit = num % 10;
				Sum += digit * digit * digit;
				num = num / 10;
			}
			if (Sum == original) {
				System.out.println("Number is Armstrong");
			} else {
				System.out.println("Number is not Armstrong");
			}
			break;
		}

		case 2: {
			int num;
			System.out.println("Enter the Number: ");
			num = 10;
			System.out.println("After Entering the Number: " + 10);

			for (int i = num; i > 0; i--) {
				System.out.println(i);
			}
			break;
		}

		case 3: {
			int digit, reverse = 0, num = 121, original = num;

			while (num != 0) {
				digit = num % 10;
				reverse = reverse * 10 + digit;
				num = num / 10;
			}
			if (reverse == original) {
				System.out.println("Number is palindrome");
			} else {
				System.out.println("Number is not palindrome");
			}
			break;
		}

		case 4: {
			int num;
			System.out.println("Enter the Number for factorial: ");
			num = 5;
			System.out.println("After Enter the Number: " + 5);
			int fact = 1;
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial is" + fact);
			break;
		}

		case 5:
			System.out.println("Exiting the program.\n");
			break;

		default:
			System.out.println("Invalid choice. Please enter a number between 1 and 5.\n");
			break;
		}

	}

}
