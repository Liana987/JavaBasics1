package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		//  Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
		//if the average score >=90  grade=A
		//if the average score >= 70 and <90  grade=B
		//if the average score>=50 and <70  grade=C
		// if the average score<50  grade=F



		//Enhanced code helps to initialize the variable based on the condition and the code is CLEANER
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the score you get in quiz");
		int quiz = input.nextInt();
		System.out.println("Enter the score you get in midterm");
		int mid = input.nextInt();
		System.out.println("Enter the score you get in final");
		int fin = input.nextInt();
		int averageS = (quiz + mid + fin) / 3;
		
		System.out.println("Your average score is " + averageS);

		char grade;//introducing this variable

		if(averageS>=90) {
		grade='A';
		}else if (averageS >= 70 && averageS <= 90) {
		grade='B';
		}else if(averageS >= 50 && averageS < 70) {
		grade='C';
		}else {
		grade='F';
		}

		
		System.out.println("You are a "+ grade +" student");
		
		/* if you are A or B student --> you are doing great
		* otherwise --> please try to study more
		*/

	if(grade=='A' || grade=='B') { // we need the == to check the equality because only one = asignes the value
		System.out.println("you are doing great");
		}else {
		System.out.println("please try to study more");
		}
		}
		}