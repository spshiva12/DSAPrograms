package com.dsa.april3rd;

import java.util.Scanner;

public class FindTriangle {

	public static String findTriangle(double side1, double side2, double side3) {

		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
			return "-1";
		}

		if (side1 == side2 && side2 == side3) {
			return "It is an Equilateral Triangle";
		} else if (side1 == side2 || side2 == side3 || side1 == side3) {
			return "It is an Isosceles Triangle";
		} else {
			return "It is a Scalene Triangle";
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double side1, side2, side3;
		side1 = sc.nextDouble();
		side2 = sc.nextDouble();
		side3 = sc.nextDouble();
		System.out.println(findTriangle(side1, side2, side3));
	}

}
