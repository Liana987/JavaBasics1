package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// Logical operators
		//These operators are: AND && is to test 1 or more condition in one statement (both conditions have to be TRUE, otherwise it will be FALSE)
		
		//AND && 
		//true && true ---we are getting TRUE
		//true && false---we are getting FALSE
		//false && false---we are getting FALSE
		//false && true----we are getting FALSE
		
		boolean job=true;
		double salary=100000;
		
		if(job && salary>=100000) {
			System.out.println("I am super duper happy");
		} //when in one statement I need to test two or more conditions,JAVA gives us a logical operators
		
		boolean study=true;
		boolean homework=true;
		boolean practice=true;
		
		if(study && homework && practice) {
			System.out.println("You will succeed");
		} else {
			System.out.println("You will struggle");
		}
		
		//write a rpogram to find largest number among three numbers using
		
		int num1=65;
		int num2=66;
		int num3=23;
		
		if (num1>num2 && num1>num3) {
			System.out.println("The largest number is " + num1);
		} else if (num3>num1 && num3>num2) {
			System.out.println("The largest number is " + num3);
		} else if (num2>num1 && num2>num3) {
			System.out.println("The largest number is " + num2);
		}
			
			
		}

	}

