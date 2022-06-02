package com.syntax.class06;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		/*Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 */
		Scanner scan=new Scanner(System.in);
		String country,language;
		
		System.out.println("Which country are you from?");
		country=scan.nextLine();
		
		switch(country) {
		case "Mexico":
			language="Spanish";
			break;
		case "Serbia":
			language="Serbian";
		break;
		case "Italy":
			language="Italian";
		break;
		default:
			language="invalid";
			break;
		}
		System.out.println("You are from "+ country + " and you speak "+ language + " language.");
		}	
		
	}


