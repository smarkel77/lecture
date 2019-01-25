package com.techelevator;

public class Card {
	private String suit;
	private String value;
	private boolean faceUp = false;

	public Card(String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	
	public String toString() {
		String cardDescriptor;
		
		if(faceUp) {
			cardDescriptor = this.value + " of " + this.suit;
		} else {
			cardDescriptor = "###";
		}

		return cardDescriptor;
	}
	
	public String getColor() {
		if(suit.equalsIgnoreCase("Hearts") || suit.equalsIgnoreCase("Diamonds")) {
			return "Red";
		} else {
			return "Black";
		}
	}
	
	
	public void flip() {
		this.faceUp = !this.faceUp;
	}

	public boolean isFaceUp() {
		return faceUp;
	}
	public String getSuit() {
		return suit;
	}
	public String getValue() {
		return value;
	}
	
}
