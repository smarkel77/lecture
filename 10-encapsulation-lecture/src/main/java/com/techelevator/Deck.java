package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Deck {

	private List<Card> listOfCards = new ArrayList<Card>();

	public static final List<String> suits = new ArrayList<String>(Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades" ));
	public static final List<String> values = new ArrayList<String>(Arrays.asList("Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"));
	
	
	public Deck() {
		for(String s : suits) {
			for(String v : values) {
				listOfCards.add(new Card(s, v));
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(listOfCards);
	}
	
	public int size() {
		return listOfCards.size();
	}
	
	public Card deal() {
		if(this.size() > 0) {
			Card nextCard = listOfCards.remove(0);
			return nextCard;
		} else {
			return null;
		}
	}

	public String toString() {
		return size() + " cards of 52 cards remaining.";
	}
		
}
