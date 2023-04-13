package com.dsa.april7th;

import java.util.Scanner;

public class NthTermOfFibonacci {

//	public static int getNthTermOfFibonacciSeries(int n) {
//		if (n <= 0) {
//			return -1;
//		}
//		if (n == 1) {
//			return 0;
//		}
//		if (n == 2) {
//			return 1;
//		}
//		int prev1 = 0;
//		int prev2 = 1;
//		int current = 0;
//		for (int i = 3; i <= n; i++) {
//			current = prev1 + prev2;
//			prev1 = prev2;
//			prev2 = current;
//		}
//		return current;
//	}

	// Using Recursion Method
	public static int getnthTermOfFibonacciSeries(int n) {
		if (n <= 0) {
			return -1;
		}
		if (n == 1) {
			return 0;
		}
		if (n == 2) {
			return 1;
		}
		return getnthTermOfFibonacciSeries(n - 1) + getnthTermOfFibonacciSeries(n - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		System.out.println(getNthTermOfFibonacciSeries(n));
		System.out.println(getnthTermOfFibonacciSeries(n));
	}

}
