package com.syntax.class11;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Using Scanner create an array of countries. When an array is created, retrieve all values from it
		//and while retrieving those values print capital for each country (use 2 different loops).
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the size of an array that you want to create");
		int arraySize=scanner.nextInt();
		String [] countryArray=new String[arraySize]; //creating an array of size that will be entered by user
		
		for(int i=0;i<countryArray.length; i++) {
			countryArray[i]=scanner.next();//takingf the input from user and storing inside the array
		}
		for(String element:countryArray) {
			if(element.equalsIgnoreCase("usa")) {
				System.out.println("Washington DC");
			}else if (element
		}

	}

}
