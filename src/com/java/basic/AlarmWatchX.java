package com.java.basic;

public class AlarmWatchX extends AlarmWatch{
	static final String PRODUCT_NAME = "Alarm Watch X";
	private String ownerName;
	AlarmWatchX(String owner) {
		super();
		this.ownerName = owner;
	}
	
	@Override
	public void alarm() {
		System.out.println(ownerName + "さんのアラームが鳴りました。\n時刻は、"+super.getAlarm());
	}
}
