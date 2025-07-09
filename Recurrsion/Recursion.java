package com.Recurrsion;

public class Recursion {

	static void Even(int n) {

		if (n == 0) {
			return;
		}

		Even(n - 1);
		
		if (n % 2 == 0) {
			System.out.print(n);
		}
	}

	static void Odd(int n) {
		if (n == 0) {
			return;
		}
		Odd(n - 1);
		if (n % 2 != 0) {
			System.out.print(n);
		}
	}

	public static void main(String[] args) {

		Odd(10);
		System.out.println();
		Even(10);

	}

}
