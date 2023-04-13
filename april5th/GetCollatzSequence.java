package com.dsa.april5th;

public class GetCollatzSequence {

	public static String getCollatzSequence(int num) {

		if (num < 1) {
			return "Error";
		}

		StringBuilder sb = new StringBuilder();
		sb.append(num);
		int count = 0;
		while (num != 1) {
			count++;
			if (count > 100) {
				return "Does not converge";
			}

			if (num % 2 == 0) {
				num /= 2;
			} else {
				num = num * 3 + 1;
			}
			sb.append(" ").append(num);
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		int num = 5;
		System.out.println(getCollatzSequence(num));
	}

}
