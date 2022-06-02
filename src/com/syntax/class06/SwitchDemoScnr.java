package com.syntax.class06;
import java.util.Scanner;

public class SwitchDemoScnr {

	public static void main(String[] args) {
		/*
		 * let's ask the user where is he from
		 * based on the country we will define favorite food
		 */
		Scanner scan=new Scanner(System.in);
		String country,favoriteFood;
		
		System.out.println("Please tell me where are you from");
		country=scan.nextLine();
		switch(country.toLowerCase()) {
		case "mexico":
		favoriteFood="taco";
		break;
		case "serbia":
		favoriteFood="sarma";
		break;
		case "canada":
		favoriteFood="poutine";
		break;
		case "turkey":
		favoriteFood="lahmacun";
		break;
		case "pakistan":
			favoriteFood="pati chai";
			break;
		default:
				favoriteFood="unknown";
				break;
		}
		System.out.println("You are from " +country+ " and your favorite food is "+ favoriteFood);
	} 

}

