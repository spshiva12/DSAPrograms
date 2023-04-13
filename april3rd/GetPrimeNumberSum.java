package com.dsa.april3rd;

public class GetPrimeNumberSum {

	public static int getPrimeNumbersSum(int start, int end) {
		if (start < 0 || end < 0) {
			return -1;
		}

		if (start == 0 || end == 0) {
			return -2;
		}

		if (start >= end) {
			return -3;
		}

		int sum = 0;

		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}

		return sum;
	}

	private static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}

		if (n == 2) {
			return true;
		}

		if (n % 2 == 0) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int a = 1, b = 10;
		System.out.println(getPrimeNumbersSum(a, b));
	}

}
