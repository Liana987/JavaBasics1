package com.syntax.class06;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At
		 * the end your program should print which grade was entered by a user with
		 * explanation.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your grade");

		String grade = scan.nextLine();
		String exp;

		switch (grade.toUpperCase()) {
		case "A":
			exp = "Excellent";
			break;
		case "B":
			exp = "Good";
			break;
		case "C":
			exp = "Average";
			break;
		case "D":
			exp = "Bad";
		default:
			exp = "Not acceptable";
		}
		System.out.println("The grade that you have entered is " + grade + " and that is " + exp);

	}
}
