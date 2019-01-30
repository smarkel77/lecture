package com.techelevator.farm;

public class Cow extends FarmAnimal {

	public Cow() {
		super("Cow", "moo!");
	}
	
	public String eat() {
		return "Hay";
	}
	
	public Cow(String type) {
		super(type, "moo!");
	}

}