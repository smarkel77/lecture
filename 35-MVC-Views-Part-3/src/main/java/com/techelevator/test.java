package com.techelevator;

public class test {
	
	
	
	
	public String solution(String S, String C) {
		String emails = null;
		S = "John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker";
		C = "example";
		String[] names = S.split(";");
		for (String name : names) {
			name = name.toLowerCase();
			int endFirstName;
			endFirstName = name.indexOf(" ");
			int lastSpace = name.lastIndexOf(" ");
			if (lastSpace > endFirstName) {
				name = name.substring(0, endFirstName) + "_"  + name.substring(lastSpace + 1);
			} else {
				name = name.replace(" ", "_");
			}
			
			emails += names;
			
		}
		
		
		
		
		return emails;
		
	}

}
