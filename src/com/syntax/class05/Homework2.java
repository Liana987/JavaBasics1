package com.syntax.class05;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// 2.	Create a Java program that will ask user to input city and temperature. Your program should convert Fahrenheit into celsius and print 
		//“The temperature is the city __ is __”
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("What is the city");
		String city=scanner.nextLine();//WHEB CAPTURING WE NEED TO DO NEXTLINE since city can consist of two words; 
		
		System.out.println("What is the temperature");
		int temp=scanner.nextInt();
		
		//To convert temperatures in degrees Fahrenheit to Celsius, subtract 32 and multiply by . 5556 (or 5/9).
		
		System.out.println("The temeprature in the city " + city + " is " + (temp-32)*0.5556);
		}

	}

