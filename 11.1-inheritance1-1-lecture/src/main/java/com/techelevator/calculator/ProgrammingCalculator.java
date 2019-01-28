package com.techelevator.calculator;

public class ProgrammingCalculator extends Calculator {

	public ProgrammingCalculator() {
		super();
	}
	
	public ProgrammingCalculator(double initialValue) {
		super(initialValue);
	}
	
	public String convertAnswerToBinary() {
		int myResult = (int)getResult();
		
		return Integer.toBinaryString(myResult);
	}	

	
}
