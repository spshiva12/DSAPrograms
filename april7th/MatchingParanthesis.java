package com.dsa.april7th;

import java.util.Stack;

public class MatchingParanthesis {

	static boolean isMatchingPair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

	static boolean isMatchingParanthesis(String s) {
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(MatchingParanthesis.isMatchingParanthesis("(a + b)"));
		System.out.println(MatchingParanthesis.isMatchingParanthesis("((4 + 4) * 5)"));
		System.out.println(MatchingParanthesis.isMatchingParanthesis("((a + b) * c)"));

	}
}
