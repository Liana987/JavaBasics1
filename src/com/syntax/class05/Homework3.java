
package com.syntax.class05;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		// Write a program to ask user to enter numbers of worked years and annual salary.
		//If user worked for more or equals to 5 years than user is eligible for the bonus, 
		//otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000
		
		//USE NESTED IF
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter number of years working");
		int years=scanner.nextInt();
				
		if(years>=5) {
			System.out.println("You are eligible for bonus");
			System.out.println("Please enter your annual salary" );//I have put here the statement and the int for the salary since we do not need it right away unless
			int salary=scanner.nextInt();                            //eligible for bonus
		if (salary>50000) {
				System.out.println("You are eligible for 5000 bonus");
				}
			else {
				System.out.println("You are eligible for 3000 bonus");
			}} else
				{System.out.println("Sorry, you are not eligible for bonus");
				}}
				}

		

	


