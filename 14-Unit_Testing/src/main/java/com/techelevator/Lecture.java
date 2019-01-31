package com.techelevator;

public class Lecture {
	
	public int squareIt(int x) {
		return x * x;
	}

	public int uncovered(int y) {
		if (y > 4) {
			return y + 2;
		} else {
			y += 16;
			return y * y;
		}
	}
	
}
