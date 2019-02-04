package com.techelevator;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lecture {

	public static String convertToRomanNumerals(int input) {

		if (input <= 0 || input >= 4000) {
			return null;
		}
		
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");
		
		String output = "";

		for(Map.Entry<Integer, String> kv : map.entrySet()) {
			int key = kv.getKey();
			String value = kv.getValue();
			
			while(input >= key) {
				output += value;
				input -= key;
			}
		}

		return output;
	}
	
}
