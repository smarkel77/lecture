package com.techelevator;


public class Examples {

	public static void main(String[] args) {
		int x;
		int y;
		
		System.out.println("*******************");
		System.out.println("**** FOR LOOPS ****");
		System.out.println("*******************");
		System.out.println();
		
		System.out.println("Displaying the numbers 0 - 9 using a for loop");
		for(int ix = 0; ix <= 10; ix++) {
			System.out.println(ix);
		}
		System.out.println();

		// Print whether each number between 1 and 10 (inclusive) is even or odd
		for(int i = -10; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
		}
		System.out.println();
		
		// loops can be nested
		System.out.println("Displaying the numbers 1 - 5, five times, using nested for loops");
		for(int i = 0; i < 5; i++) {
			System.out.println("i: " + i);
			for(int j = 1; j <= 5; j++) {
				System.out.println("\tj: "+ j);
			}
		}
		System.out.println();
		
		System.out.println("****************");
		System.out.println("**** ARRAYS ****");
		System.out.println("****************");
		System.out.println();
		
		// the following line declares an array of Strings with 4 elements
		String[] fruit = new String[4];			
		fruit[0] = "Apple";
		fruit[1] = "Orange";
		fruit[2] = "Banana";
		fruit[3] = "Pear";
		System.out.println("I have "+fruit.length+" fruits!");
		for(int index = 0; index < fruit.length; index++) {
			System.out.println(fruit[index]);
		}
		System.out.println();
		
		// the following array has length 3 even when no values have been assigned.
		String[] trees = new String[3];
		System.out.println("I have room for "+trees.length+" trees!");  
		trees[1] = "Maple";
		System.out.println(trees[1]);
		
		int[] intArray = { 1, 2, 3 };			// this is how we declare an array literal
		for(int ix = 0; ix < intArray.length; ix++) {
			System.out.print(intArray[ix]);
		}
		System.out.println();
		System.out.println();
		
		// The same literal syntax would apply to an array of Strings
		String[] stooges = { "Larry", "Curly", "Moe" };
		
		/* Arrays are reference types, so they are "passed by reference".  In other words. when assigning
		 * the value of one array variable to another array variable, we are assigning a reference 
		 * to the same array to both */
		char[] firstArray = {'a', 'b', 'c'};
		char[] secondArray = firstArray;
		
		secondArray[0] = 'z';
		System.out.println("firstArray[0]: "+firstArray[0]);
		System.out.println("secondArray[0]: "+secondArray[0]);
	}

}
