package com.techelevator.clock;

public class Program {

	public static void main(String[] args) {
		Clock firstClock = new Clock(11, 12, 20);
		System.out.println(firstClock.getCurrentTime());
		System.out.println(firstClock.makeSound());
		
		
		GrandfatherClock secondClock = new GrandfatherClock(11, 19, 46, 20.00);
		System.out.println(secondClock.getCurrentTime());
		System.out.println(secondClock.makeSound());

		
		CuckooClock thirdClock = new CuckooClock(11, 32, 15);
		System.out.println(thirdClock.getCurrentTime());
		System.out.println(thirdClock.makeSound());

	}

}
