package com.dsa.sumofmultiples;

public class SumOfMultiples {

	public static int sumOfMultiples(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return -1;
		}
		int sum = round(a) + round(b) + round(c);
		return sum;
	}

	public static int round(int num) {
		if (num % 10 >= 5) {
			return ((num / 10) + 1) * 10;
		} else {
			return (num / 10) * 10;
		}
	}

	public static void main(String[] args) {
		System.out.println(sumOfMultiples(10, 12, 22));

	}

}
