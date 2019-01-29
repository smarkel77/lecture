package com.techelevator;

public class Lecture {

	public static void main(String[] args) {
		
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/
		
		int numberOfExercises;
		numberOfExercises = 26;

		System.out.println(numberOfExercises);

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/
		
		double half;
		half = 0.5;

		System.out.println(half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/

		String name = "Tech Elevator";
		
		System.out.println(name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/

		byte seasonsOfFirefly = 1;
		System.out.println(seasonsOfFirefly);

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/

		String myFavoriteLanguage = "Java";
		System.out.println(myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/
		
		//float pi = 3.1416F;

		double pi = 3.1416;
		System.out.println(pi);

		/*
		7. Create and set a variable that holds your name.
		*/
		
		String myNameIs = "Slim Shady";
		System.out.println(myNameIs);

		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/
		
		int numberOfButtonsOnMyMouse = 5;
		System.out.println(numberOfButtonsOnMyMouse);

		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/
		
		float pctBatteryLife = 0.76f;

		System.out.println(pctBatteryLife);
		
		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/
		
		int difference = 121 - 27;
		System.out.println(difference);
		

		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
		
		double sum = 12.3f + 32.1f;

		/*
		12. Create a String that holds your full name.
		*/

		String fullName = "Tom Medvitz";
		System.out.println(fullName);
		
		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
		
		String helloTom = "Hello, " + fullName;
		//System.out.println("The value of helloTom is: " + helloTom);

		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/
		
		
		fullName = fullName + ", Esquire";

		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/
		String newName = "Bill S. Preston";
		
		newName = "Dr. " + newName;
		newName += "Dr. ";
		
		newName = newName + ", Esquire";
		newName += ", Esquire";
		
		System.out.println(newName);
		
		int x = 5;
		x = x + 10;
		x += 10;
		
		System.out.println(x);

		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
		String horrorMovie = "Saw" + 2;
		System.out.println(horrorMovie);

		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/
		horrorMovie += "0";
		System.out.println(horrorMovie);

		/*
		18. What is 4.4 divided by 2.2?
		*/
		System.out.println(4.4 / 2.2);

		/*
		19. What is 5.4 divided by 2?
		*/

		System.out.println(5.4 / 2);

		
		/*
		20. What is 5 divided by 2?
		*/
		
		System.out.println(5 / 2);


		/*
		21. What is 5.0 divided by 2?
		*/
		System.out.println(5.0 / 2);

		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/

		double result = (66.6 / 100)  * 100000;
		//System.out.println(result);
		//System.out.printf("%.3f %s", result, "a string");
		
		/*
		23. If I divide 5 by 2, what's my remainder?
		*/
		
		System.out.println(5 % 2);
		

		/*
		24. What is 1,000,000,000 * 3?
		*/
		
		long y = 1000000000l * 3;
		System.out.println(y);

		/*
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/
		
		boolean doneWithExercises = false;

		/*
		26. Now set doneWithExercise to true.
		*/
		
		doneWithExercises = true;
		
	}

}
