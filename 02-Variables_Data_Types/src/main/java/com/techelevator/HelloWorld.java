package com.techelevator;

public class HelloWorld {

	public static void main(String[] args) {
	
		System.out.println("Running main!");
		
		int x = 4;
		squareIt(x);
		
		System.out.println(x);
		//System.out.println(xSquared);
		
		System.out.println("Done with main!");

	}
	
	
	public static void squareIt(int x) {
		System.out.println("Inside squareIt...");
		//return x * x;
	}
	

}
