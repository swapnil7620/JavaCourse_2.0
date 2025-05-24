package com.Basic;

public class PrimeNumber {

	public static void main(String[] args) {
		int i, num, n, count;
		System.out.println("Enter the range: ");
		n = 50;
		System.out.println("After Enter the range: " + 50);

		System.out.println("The prime numbers in between the range 1 to  " + n);
		for (num = 1; num <= n; num++) {
			count = 0;
			for (i = 2; i <= num /2 ; i++) {
				if (num % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0)
				System.out.print(num+ ",");
		}
	}
}
