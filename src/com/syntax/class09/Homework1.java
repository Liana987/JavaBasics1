package com.syntax.class09;

public class Homework1 {

public static void main(String[] args) {
		
		// Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		
		String[] cars = {"BMW", "Audi", "Subaru", "Ford", "Honda", "Toyota"};
		
		for (String car:cars) {
			System.out.print(car+" ");
		}
		
		System.out.println();
		
		String[] cars1 = {"BMW", "Audi", "Subaru", "Ford", "Honda", "Toyota"};
		
		for (int i=0; i<cars1.length; i++) {
			System.out.print(cars1[i]+" ");
			
		}
	}
}


