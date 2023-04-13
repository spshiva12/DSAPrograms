package com.dsa.calculate;

public class Calculate {

	public static int calculate(int num) {
		if (num <= 0) {
			return -1;
		} else if (num % 2 == 0) {
			return num * num;
		} else {
			return num * num * num;
		}
	}

	public static void main(String[] args) {
		System.out.println(calculate(4));
		System.out.println(calculate(3));
		System.out.println(calculate(0));
		System.out.println(calculate(-4));

	}

}
