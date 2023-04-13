package com.dsa.sumofrounded;

public class SumOfRoundedNumbers {

	public static int sumOfRoundedValues(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return -1;
		}
		int sum = 0;
		sum += round(a);
		sum += round(b);
		sum += round(c);
		return sum;
	}

	public static int round(int num) {
		int rem = num % 10;
		if (rem < 5) {
			return (num / 10) * 10;
		} else {
			return ((num / 10) + 1) * 10;
		}
	}

	public static void main(String[] args) {
		int a = 20, b = 34, c = 66;
		System.out.println(sumOfRoundedValues(a, b, c));
	}
}
