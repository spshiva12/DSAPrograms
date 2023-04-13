package com.dsa.april6th;

import java.util.Arrays;

public class GetFibonacciSeries {

	public static String getFibonacciSeries(int n) {
		if (n <= 0) {
			return null;
		}
		if (n == 1) {
			return "0";
		}

		int fib[] = new int[n];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		String output = Arrays.toString(fib);
		return output.substring(1, output.length() - 1).replace(",", ",");

	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println(getFibonacciSeries(n));
	}

}
