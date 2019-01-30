package com.techelevator.farm;

public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private boolean isAsleep = false;
	
	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}
	
	
	public abstract String eat();
	
	public void sleep() {
		this.isAsleep = true;
	}

	public final String getName( ) {
		return name;
	}

	public final String getSound( ) {
		return isAsleep ? "Zzzz..." : sound;
	}

	public boolean isAsleep() {
		return this.isAsleep;
	}
	
}