package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PaintCalc {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<Wall> listOfWalls = new ArrayList<Wall>();		
		
		while(true) {
			
			System.out.println();
			System.out.println("[1] Add a wall");
			System.out.println("[2] Calculate paint required (and Exit)");
			System.out.print("Please choose >>> ");
			String userChoice = scan.nextLine();
			
			System.out.println();
			
			if(userChoice.equals("1")) {
				
				
				System.out.print("Enter wall height >>> ");
				int height = Integer.parseInt(scan.nextLine());
				System.out.print("Enter wall width >>> ");
				int width = Integer.parseInt(scan.nextLine());
				int area = height * width;
				System.out.println("Added "+height+"x"+width+" wall - "+area+" square feet");
				
				Wall temporaryWall = new Wall(width, height);
				
				temporaryWall.setWidth(10);
				
				listOfWalls.add(temporaryWall);
				
			} else if(userChoice.equals("2")) {
				
				// Here we need to sum up the areas of all walls that have been entered
				int totalArea = 0;
				for(Wall thisParticularWall : listOfWalls) {
					totalArea += thisParticularWall.getArea();
				}

				System.out.println("===============================");
				System.out.println("Total Area: "+totalArea+" square feet");
				
				// 1 gallon of paint covers 400 square feet
				float gallonsRequired = (float)totalArea / 400;
				System.out.println("Paint Required: "+gallonsRequired+" gallons");
				
				System.exit(0); // Causes the program to end
			}
		}
	}

}
