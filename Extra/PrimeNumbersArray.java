package com.Extra;

import java.util.ArrayList;

public class PrimeNumbersArray {
	
    public static void main(String[] args) {
    	
        int[] numbers = {12, 7, 19, 25, 5};
        ArrayList<Integer> primes = new ArrayList<>();

        for (int n : numbers) {
            if (isPrime(n)) {
                primes.add(n);
            }
        }

        System.out.print("Prime numbers: ");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

