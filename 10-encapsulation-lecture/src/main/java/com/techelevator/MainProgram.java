package com.techelevator;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class MainProgram {

	public static void main(String[] args) {
		/*
		Card firstCard = new Card("Spades", "Ace");
		firstCard.flip();
		
		Card secondCard = new Card("Spades", "Ace");
		secondCard.flip();
		// System.out.println(firstCard);
		// System.out.println(secondCard);
		
		*/
		
		
		final int x;
		double pi = Math.PI;
		
		Deck deckOfCards = new Deck();
		deckOfCards.shuffle();
		
		for(int i = 0; i < 100; i++) { 
			Card myCard = deckOfCards.deal();
			if(myCard != null) {
				myCard.flip();
				System.out.println("My card is: " + myCard);
			}			
		}
		x = 9;
		
		System.out.println(deckOfCards.size());
		Deck.suits.add("new suit");
		
		System.out.println(Deck.suits.size());
		
		System.out.println("\n\nDone!");
	}

}
