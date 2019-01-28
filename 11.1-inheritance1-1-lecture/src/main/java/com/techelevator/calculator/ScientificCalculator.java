package com.techelevator.calculator;

public class ScientificCalculator extends Calculator {

	public ScientificCalculator() {
		super();
	}
	
	public ScientificCalculator(double initialValue) {
		super(initialValue);
	}
	
	public int mod(double input) {
		return (int)getResult() % (int)input;
	}
	
	public double tangent() {
		return Math.tan(getResult());
	}
	
	public double sine() {
		return Math.sin(getResult());
	}
	
	public double cosine() {
		return Math.cos(getResult());
	}
	
}
