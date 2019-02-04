package com.techelevator;

import org.junit.Test;
import org.junit.Assert;

public class LectureTest {
	
	@Test
	public void check_negative_input() {
		for(int i = Integer.MIN_VALUE; i < 0; i+= 100000) {
			// System.out.println("Testing: " + i);
			String output = Lecture.convertToRomanNumerals(i);
			Assert.assertNull(output);
		}		
	}

	@Test
	public void check_upper_bound_input() {
		for(int i = Integer.MAX_VALUE; i > 3999; i -= 100000) {
			// System.out.println("Testing: " + i);
			String output = Lecture.convertToRomanNumerals(i);
			Assert.assertNull(output);
		}		
	}

	
	@Test
	public void check_input_of_zero() {
		int input = 0; // Arrange
		String output = Lecture.convertToRomanNumerals(input); // Act
		Assert.assertNull(output); // Assert		
	}
	
	@Test
	public void return_I_when_given_1() {
		int input = 1; // Arrange
		String output = Lecture.convertToRomanNumerals(input); // Act
		Assert.assertEquals("I", output); // Assert
	}
	
	@Test
	public void return_V_when_given_5() {
		int input = 5; // Arrange		
		String output = Lecture.convertToRomanNumerals(input); // Act
		Assert.assertEquals("V", output); // Assert		
	}
	
	@Test
	public void return_X_when_given_10() {
		int input = 10; // Arrange		
		String output = Lecture.convertToRomanNumerals(input); // Act
		Assert.assertEquals("X", output); // Assert		
	}
	
	@Test
	public void return_L_when_given_50() {
		int input = 50; // Arrange		
		String output = Lecture.convertToRomanNumerals(input); // Act
		Assert.assertEquals("L", output); // Assert		
	}
	
	@Test
	public void return_C_when_given_100() {
		int input = 100; // Arrange		
		String output = Lecture.convertToRomanNumerals(input); // Act
		Assert.assertEquals("C", output); // Assert		
	}
	
	@Test
	public void return_D_when_given_500() {
		int input = 500; // Arrange		
		String output = Lecture.convertToRomanNumerals(input); // Act
		Assert.assertEquals("D", output); // Assert		
	}
	
	@Test
	public void return_M_when_given_1000() {
		int input = 1000; // Arrange		
		String output = Lecture.convertToRomanNumerals(input); // Act
		Assert.assertEquals("M", output); // Assert		
	}
	
	@Test
	public void return_II_when_given_2() {
		int input = 2; // Arrange		
		String output = Lecture.convertToRomanNumerals(input); // Act
		Assert.assertEquals("II", output); // Assert		
	}
	
	@Test
	public void return_III_when_given_3() {
		int input = 3; // Arrange		
		String output = Lecture.convertToRomanNumerals(input); // Act
		Assert.assertEquals("III", output); // Assert		
	}

	@Test
	public void return_IV_when_given_4() {
		int input = 4; // Arrange		
		String output = Lecture.convertToRomanNumerals(input); // Act
		Assert.assertEquals("IV", output); // Assert		
	}


	@Test
	public void return_MM_when_given_2000() {
		int input = 2000; // Arrange		
		String output = Lecture.convertToRomanNumerals(input); // Act
		Assert.assertEquals("MM", output); // Assert		
	}
	
	@Test
	public void return_MMM_when_given_3000() {
		int input = 3000; // Arrange		
		String output = Lecture.convertToRomanNumerals(input); // Act
		Assert.assertEquals("MMM", output); // Assert		
	}

	@Test
	public void return_IX_when_given_9() {
		int input = 9; // Arrange		
		String output = Lecture.convertToRomanNumerals(input); // Act
		Assert.assertEquals("IX", output); // Assert		
	}
	
	@Test
	public void return_XXX_when_given_30() {
		int input = 30; // Arrange		
		String output = Lecture.convertToRomanNumerals(input); // Act
		Assert.assertEquals("XXX", output); // Assert		
	}
	
	@Test
	public void return_XXIX_when_given_29() {
		int input = 29; // Arrange		
		String output = Lecture.convertToRomanNumerals(input); // Act
		Assert.assertEquals("XXIX", output); // Assert		
	}
	
	@Test
	public void return_XIV_when_given_14() {
		int input = 14; // Arrange		
		String output = Lecture.convertToRomanNumerals(input); // Act
		Assert.assertEquals("XIV", output); // Assert		
	}

	@Test
	public void return_MCMXCVIII_when_given_1998() {
		int input = 1998; // Arrange		
		String output = Lecture.convertToRomanNumerals(input); // Act
		Assert.assertEquals("MCMXCVIII", output); // Assert		
	}

	@Test
	public void test_maximum_valid_roman_numeral() {
		int input = 3999; // Arrange		
		String output = Lecture.convertToRomanNumerals(input); // Act
		Assert.assertEquals("MMMCMXCIX", output); // Assert		
	}
	
}
