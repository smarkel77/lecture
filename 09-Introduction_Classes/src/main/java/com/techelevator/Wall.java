package com.techelevator;

public class Wall {
	
	private long height;
	private long width;
	private int changeCounter;
	
	public Wall(int width, int height) {
		this.width = width;
		this.height = height;
		changeCounter = 0;
	}
	
	public int getArea() {
		return (int)(height * width);
	}

	
	public void setWidth(int width) {
		this.width = width;
		changeCounter++;
	}

	public void setHeight(int height) {
		this.height = height;
		changeCounter++;
	}
	
}
