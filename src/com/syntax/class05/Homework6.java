package com.syntax.class05;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		//  Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
		//if the average score >=90  grade=A
		//if the average score >= 70 and <90  grade=B
		//if the average score>=50 and <70  grade=C
		// if the average score<50  grade=F

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your quiz score");
		
		int quiz=scanner.nextInt();
		
		System.out.println("Enter your midterm score");
		int midterm=scanner.nextInt();
		
		System.out.println("Enter your final score");
		int finalScore=scanner.nextInt();
		
		int avrgscore=((quiz+midterm+finalScore)/3);
		
		if (avrgscore>=90)
			System.out.println("Your grade is A");
		else if(avrgscore>=70 && avrgscore<90)
			System.out.println("Your grade is B");
		else if(avrgscore>=50 && avrgscore<70)
			System.out.println("Your grade is C");
		else if (avrgscore<50)
			System.out.println("Your grade is F");}}
		
