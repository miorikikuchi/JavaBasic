package com.java.basic;

import java.util.Calendar;

public class Lesson4 {

	public static void main(String[] args) {
		AlarmWatchX watchX = new AlarmWatchX("Tom");

		System.out.println(watchX.getTime());
		Calendar cal = Calendar.getInstance();

		cal.set(2020, 0, 1);
		watchX.setAlarm(cal.getTime());

	}
}
