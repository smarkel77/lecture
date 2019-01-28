package com.techelevator.calculator;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Calculator {
	private double result = 0.0;
	
	public Calculator() {
		
	}
	
	public Calculator(double initialValue) {
		this.result = initialValue;
	}
	
	public void enterNumber(double input) {
		result = input;
	}
	
	public void reset() {
		result = 0.0;
	}
	
	public static boolean isGreaterThan(BigDecimal bd) {
		BigInteger zero = BigInteger.ZERO;
		int answer = bd.compareTo(new BigDecimal(0));
		return answer == 1;
	}
	
	public double power(double input) {
		result = Math.pow(result, input);
		return result;
	}
	
	public double add(double input) {
		this.result += input;
		return this.result;
	}
	
	public double subtract(double input) {
		this.result -= input;
		return this.result;
	}

	public double multiply(double input) {
		this.result *= input;
		return this.result;
	}

	public double divide(double input) {
		if(input == 0) {
			return 0.0;
		}

		this.result /= input;
		return this.result;
	}
	
	public double getResult() {
		return this.result;
	}

}
