package com.techelevator;

public class Wall {
	//access modifiers
	private int height;
	private int width;
	
	//constructor
	public Wall(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//derived property
	public int getArea() {
		return width * height;
	}
	
	//Stringifacation
	public String toString() {
		return "wall " + this.width + " * " + this.height;
	}
	
	//object equality
	public boolean equals(Wall inputWall) {
		return this.width * this.width == inputWall.getArea();
	}
	
	//getters and setters
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}

}
