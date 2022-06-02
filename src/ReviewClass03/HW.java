package ReviewClass03;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		//Write a program to ask user to enter value for sale: yes or no
		// if there is no sale --> you are not going for shopping
		//if there is sale ask user which item they want to buy and it’s price
		//Based on the price you have to calculate the price of the item after the discount, discount rule:
		//if price is less than $20 --> apply 10%
		//if price is between $20 & $100 --> 20%
		//if price between $100 & $500 --> 30%
		//otherwise apply 50% discount
		//After discount ___ the price of the item reduce from __ to ___
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Is there a sale going on");
		boolean isSale=scan.nextBoolean();
		if(!isSale) {
			System.out.println("you are not going for shopping");
		} else {
			System.out.println("Please enter which item you want to buy and also enter its price");
			String item=scan.next();
			double price=scan.nextDouble();
			double discountedPrice=0;
			
			if(price<20) {
				double discountedPrice1=price*0.9; //or price-price*0.1
				System.out.println("After discount " + item + " the price of the item reduce from " + price + " to " + discountedPrice1 );
			}else if (price>=20 && price<=100) {
				discountedPrice=price*0.8;//price-price*0.2
				System.out.println("After discount " + item + " the price of the item reduce from " + price + " to " + discountedPrice );
			} else if(price>100 && price<=500) {
				discountedPrice=price*0.7;//price-price*0.3
				System.out.println("After discount " + item + " the price of the item reduce from " + price + " to " + discountedPrice);
			}else {
				discountedPrice=price*0.5;//price-price*0.5
				System.out.println("After discount " + item + " the price of the item reduce from " + price + " to " + discountedPrice);
			}
		}

	}

}
