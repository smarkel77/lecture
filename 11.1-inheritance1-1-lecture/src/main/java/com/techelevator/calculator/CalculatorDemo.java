package com.techelevator.calculator;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Calculator c = new Calculator(99);
		c.add(100);
		System.out.println(c.getResult());
		
		ProgrammingCalculator pc = new ProgrammingCalculator(555);
		pc.add(111);
		System.out.println(pc.convertAnswerToBinary());
		
		ScientificCalculator sc = new ScientificCalculator(666);
		System.out.println(sc.sine());
		
	}

}
