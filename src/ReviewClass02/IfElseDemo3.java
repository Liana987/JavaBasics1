package ReviewClass02;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
		
		Scanner Obama=new Scanner(System.in);//allows to take the input from the keyboard; can be named anything we want
		System.out.println("Please Enter your Account balance");// it prints whatever we want inside the brackets
		double accountBalance=Obama.nextDouble();
		System.out.println("Please enter the amount that you want to lend to your friend");
		double amountToLend=Obama.nextDouble();
		
		if(accountBalance>=amountToLend) {
			System.out.println("Yes I can help you");
		}else {
			System.out.println("Sorry I dont have enough money to help you");
		}

	}

}
