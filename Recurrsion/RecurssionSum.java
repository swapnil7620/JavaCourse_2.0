package com.Recurrsion;

public class RecurssionSum {
	static int Total = 0;

	static int Sum(int n) {
		if (n == 0) {
			System.out.println("Sum of Number is :" + Total);
			return Total;
		}
		Total = Total + n;

		return Sum(n - 1);
	}

	public static void main(String[] args) {

		
		Sum(10);
//		int result = Sum(10);
//		System.out.println("Total Sum: " + result);

	}

}
