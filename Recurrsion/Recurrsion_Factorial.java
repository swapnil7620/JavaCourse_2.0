package com.Recurrsion;

public class Recurrsion_Factorial {

	

	 static int Factorial(int n) {
		 if ( n == 0) {
			 return 1;
		}
		 return n * Factorial(n - 1);
	 }
	
	public static void main(String[] args) {
		
		int result = Factorial(5);
        System.out.println("Factorial of 5 is: " + result);

	}

}
