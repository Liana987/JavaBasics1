package com.syntax.class05;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		// Write a program for user to enter his hers birth month. Based on the month
		// define the season.
		// Example if user is born in March, April, May  season =“Spring”
		// if user is born in June, July, August 
		// season =“Summer” etc …
		// At the end of the program we should see output as “You were born is season
		// ______“.

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your birth month");
		String month=scanner.nextLine();
		
		if (month.equalsIgnoreCase ("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase ("May")) {// we can use also month.equalsIgnoreCase ("March")
			System.out.println("You were born in season Spring");
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			System.out.println("You were born in season Summer");
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			System.out.println("You were born in season Autumn");
		} else if (month.equalsIgnoreCase("December") || month.equals("January") || month.equals("February")) {
			System.out.println("You were born in season Winter");
		}
		
	//month.equalsIgnoreCase ("March") only for STRINGS
		
	}

}
