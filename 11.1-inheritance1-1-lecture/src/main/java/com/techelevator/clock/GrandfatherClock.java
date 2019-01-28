package com.techelevator.clock;

public class GrandfatherClock extends Clock {
	private double price;
	
	
	public GrandfatherClock(int h, int m, int s, double price) {
		super(h, m, s);
		this.price = price;
	}
		
	@Override
	public String makeSound() {
		if(getSecond() % 2 == 0) {
			return "tick";
		} else {
			return "tock";
		}
	}
	
	@Override
	public String toString() {
		return "This is a grandfather clock!";
	}
	
}
