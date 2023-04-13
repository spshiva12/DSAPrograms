package com.dsa.april3rd;

import java.util.Arrays;

public class FillMultiples {

	public static int[] getMultiplesArray(int number) {
		if (number <= 0) {
			return null;
		}

		int[] multiples = new int[10];

		for (int i = 0; i < multiples.length; i++) {
			multiples[i] = number * (i + 1);
		}

		return multiples;
	}

	public static void main(String[] args) {
		int num = 10;
		System.out.println(Arrays.toString(getMultiplesArray(num)));
	}

}
