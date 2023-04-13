package com.dsa.countboolean;

public class CountBoolean {

	public static boolean countBoolean(boolean b1, boolean b2, boolean b3) {
		if ((b1 && b2) || (b1 && b3) || (b2 && b3)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(countBoolean(true, true, true));
		System.out.println(countBoolean(true, true, false));
		System.out.println(countBoolean(true, false, false));
		System.out.println(countBoolean(false, false, false));
	}

}
