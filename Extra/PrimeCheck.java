package com.Extra;


import java.util.Scanner;



public class PrimeCheck {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a prime number.");
                return;
            }
        }

        System.out.println(number + " is a prime number.");
    }
}
