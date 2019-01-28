package com.techelevator.clock;

public class CuckooClock extends Clock {
	
	public CuckooClock(int h, int m, int s) {
		super(h, m, s);
	}
	
	
	@Override
	public String makeSound() {
		return "Cuckoo! Cuckoo!";
	}
	
}
