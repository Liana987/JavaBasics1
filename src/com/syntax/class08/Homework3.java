package com.syntax.class08;
import java.util.Scanner;
public class Homework3 {

	public static void main(String[] args) {
		//Write a program to ask a user to enter item they want to buy and the price of that item. Every time user enters money, accumulate the amount and tell the user how much is left to pay off. If user give more 
		//money program should return a change. 
		//Whenever a user done with payments program should say “Thank you for shopping!”
		Scanner scan=new Scanner(System.in);
		System.out.println("What would you like to buy?");
		String item=scan.nextLine();
		System.out.println("What is the price of the item?");
		int price=scan.nextInt();
		int payment=0;
		int balance=price-payment;
		
		do {System.out.println("How much would you like to pay?");
		payment=scan.nextInt();
		balance=balance-payment;
		} while (balance>0);
		if(balance==0) {
			System.out.println("The balance is paid off.Thank you for shopping");
		}else if (balance<0){
			System.out.println("Thank you for shopping.Your change is " + balance*(-1)+ "dollars.");
		}
		}}
