package com.syntax.class05;

import java.util.Scanner;

public class Task2Class5 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Do you have a credit card,true or false");
		boolean card=scan.nextBoolean();
		
		if(card) {
			System.out.println("What is the balance on the card");
			double balance=scan.nextDouble();
		 if(balance>1000) {
			System.out.println("You need to pay it off immediately");}
		 else 
			System.out.println("You can spend more money");
		} else {
			System.out.println("I can offer you a credit card");
		}
		
		

	}

}




	