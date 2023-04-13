package com.dsa.ringalarms;

public class RingAlarms {

	public static String ringAlarm(int day, boolean vacation) {
		if (day < 0 || day > 6 || !(vacation == true || vacation == false)) {
			return "Invalid Inputs";
		} else if (day >= 1 && day <= 5 && vacation == true) {
			return "10:00";
		} else if (day >= 1 && day <= 5 && vacation == false) {
			return "07:00";
		} else if ((day == 0 || day == 6) && vacation == true) {
			return "OFF";
		} else {
			return "10:00";
		}
	}

	public static void main(String[] args) {
		System.out.println(ringAlarm(1, false));
		System.out.println(ringAlarm(5, true));
		System.out.println(ringAlarm(6, true));
		System.out.println(ringAlarm(7, false));

	}

}
