package com.syntax.class05;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		//If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is the loan amount needed");
		int num=scanner.nextInt();
		
		if (num<=200000) {
			System.out.println("I will lend you the money");}
		else
			System.out.println("I have to reject you");
		}

	}


