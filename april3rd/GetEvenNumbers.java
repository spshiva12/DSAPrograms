package com.dsa.april3rd;

import java.util.ArrayList;
import java.util.List;

public class GetEvenNumbers {

	public static String getEvenNumbers(int value1, int value2) {
		if (value1 < 0 || value2 < 0) {
			return "-1";
		}

		if (value1 == 0 || value2 == 0 || value1 == value2) {
			return "-2";
		}

		int start = value1 < value2 ? value1 : value2;
		int end = value1 > value2 ? value1 : value2;

		List<Integer> evenNumbers = new ArrayList<>();

		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				evenNumbers.add(i);
			}
		}

		String result = "";

		for (int i = 0; i < evenNumbers.size(); i++) {
			result += evenNumbers.get(i);

			if (i < evenNumbers.size() - 1) {
				result += " ";
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println(getEvenNumbers(a, b));
	}

}
