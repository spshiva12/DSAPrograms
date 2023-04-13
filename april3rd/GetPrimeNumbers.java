package com.dsa.april3rd;

public class GetPrimeNumbers {

	public static String getPrimeNumbers(int num1, int num2) {
		if (num1 < 0 || num2 < 0) {
			return "-1";
		} else if (num1 >= num2) {
			return "-2";
		}

		StringBuilder primeNumbers = new StringBuilder();
		for (int i = num1; i <= num2; i++) {
			if (isPrime(i)) {
				primeNumbers.append(i).append(" ");
			}
		}

		return primeNumbers.toString();
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(getPrimeNumbers(-5, 10)); // Output: -1
		System.out.println(getPrimeNumbers(10, 5)); // Output: -2
		System.out.println(getPrimeNumbers(1, 20)); // Output: 2 3 5 7 11 13 17 19

	}

}
