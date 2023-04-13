package com.dsa.april3rd;

public class WeavedString {

	public static String getWeavedString(String value1, String value2) {
		if (value1.isBlank() || value2.isBlank()) {
			return "-1";
		}

		StringBuilder weavedString = new StringBuilder();
		if (value1.length() > value2.length()) {
			weavedString.append(value2).append(value1).append(value2);
		} else if (value1.length() < value2.length()) {
			weavedString.append(value1).append(value2).append(value1);
		} else {
			for (int i = 0; i < value1.length(); i++) {
				weavedString.append(value1.charAt(i)).append(value2.charAt(i));
			}
		}

		return weavedString.toString();
	}

	public static void main(String[] args) {
		System.out.println(getWeavedString("Hello", "World")); // Output: WHeolrlold
		System.out.println(getWeavedString("World", "Hello")); // Output: HWorldoHellorl
		System.out.println(getWeavedString("Hello", "Hello")); // Output: HHeelollo
		System.out.println(getWeavedString("Hello", "")); // Output: -1

	}

}
