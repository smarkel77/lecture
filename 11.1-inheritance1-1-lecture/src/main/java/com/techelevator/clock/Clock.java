package com.techelevator.clock;

public class Clock {
	private int hour;
	private int minute;
	private int second;
	
	
	public Clock(int hr, int mn, int sc) {
		this.hour = hr;
		this.minute = mn;
		this.second = sc;
	}
	
	public String makeSound() {
		return "I am the superclass!";
	}
	
	public String getCurrentTime() {
		return hour + ":" + minute + ":" + second;
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
}
