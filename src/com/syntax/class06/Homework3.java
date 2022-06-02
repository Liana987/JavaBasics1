package com.syntax.class06;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		/*
		 * HW: Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user. Please
		 * complete this assignment in 2 ways: using if statement and switch case.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1 = scan.nextInt();
		System.out.println("Please enter the operator");
		char op = scan.next().charAt(0);
		System.out.println("Please enter second number");
		int num2 = scan.nextInt();
		int calculation = 0;

		switch (op) {

		case ('+'):
			calculation = (num1 + num2);
			break;
		case ('-'):
			calculation = (num1 - num2);
			break;
		case ('*'):
			calculation = (num1 * num2);
			break;
		case ('/'):
			calculation = (num1 / num2);
			break;
		}

		System.out.println("The final result is " + calculation);

		System.out.println("-----------------------------");
		
		System.out.println("Enter the first number");
		double first=scan.nextDouble();
		System.out.println("Enter the arithmetic operator");
		char arith=scan.next().charAt(0);                                   ///why???? (ask at the review class)
		System.out.println("Enter the second number");
		double second=scan.nextDouble();
		
		double numtotal = 0;                                                //why? (for review class)
		if (arith=='+') {													//double or int to be used?
			numtotal=(num1+num2);}
		else if (arith=='-') {
			numtotal=(num1-num2);}
		else if (arith=='*') {
			numtotal=(num1*num2);}
		else if (arith=='/') {
			numtotal=(num1/num2);}
		
		System.out.println("The final result is " + numtotal);
		} 
		
		
		
		
	}


