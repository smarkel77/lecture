package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {
		

		List<String> myString = new ArrayList<String>();
		
		List<Singable> singableThings = new ArrayList<Singable>();
		Tractor t = new Tractor();
		singableThings.add(t);
		
		Singable[] farmAnimals = new Singable[] { new Cow(), new Chicken(), new Tractor() };
		
		for(Singable farmThing : farmAnimals) {
			String name = farmThing.getName();
			String sound = farmThing.getSound();
			
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a "+name+", ee, ay, ee, ay, oh!");
			System.out.println("With a "+sound+" "+sound+" here");
			System.out.println("And a "+sound+" "+sound+" there");
			System.out.println("Here a "+sound+" there a "+sound+" everywhere a "+sound+" "+sound);
			
			System.out.println();
		}
	}
}