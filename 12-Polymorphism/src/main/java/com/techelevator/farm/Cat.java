package com.techelevator.farm;

public class Cat extends FarmAnimal {

	public Cat() {
		super("Cat", "Meow!");
	}
	
	public String eat() {
		return "Fancy Feast!";
	}
	
	/*
	@Override
	public String getSound() {
		String sleeping = isAsleep() ? "(Sleeping!)" : "(Awake!)";
		return "Meow! " + sleeping;
	}
	*/
}
