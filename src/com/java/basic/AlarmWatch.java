package com.java.basic;

import java.util.Date;

public abstract class AlarmWatch implements AlarmWatchInterface{
	private Date nowDate;
	private Date alarmDate;
	
	AlarmWatch() {
		this.nowDate = new Date();
		this.alarmDate = new Date();
	}
	
	@Override
	public String getTime() {
		return "現在の時間は、"+this.nowDate +"です。";
	}
	
	@Override
	public void setTime(Date date) {
		this.nowDate = date;
	}
	
	@Override
	public void setAlarm(Date date) {
		this.alarmDate = date;
	}
	
	public Date getAlarm() {
		return this.alarmDate;
	}
	
	abstract public void alarm();
}
