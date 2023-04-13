package com.dsa.april3rd;

public class Armstrong {

	public static String checkArmstrong(int number) {
		if (number < 0) {
			return "-1";
		}

		if (number < 1000 || number > 9999) {
			return "-2";
		}

		int sum = 0;
		int temp = number;

		while (temp != 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, 4);
			temp /= 10;
		}

		if (sum == number) {
			return "ArmStrong Number";
		} else {
			return "Not ArmStrong Number";
		}
	}

	public static void main(String[] args) {
		int n = 8208;
		System.out.println(checkArmstrong(n));
	}

}
