package com.syntax.class09;

public class Homework2 {

		
		public static void main(String[] args) {
			// Create an array of animals and store 5 elements into it. Using 2 different
			// loops print all elements from the array
			String[] animals = { "Dog", "Cat", "Mouse", "Bear", "Skunk" };
			for (int i = 0; i < animals.length; i++) {
				System.out.print(animals[i] + " ");
			}
			
			System.out.println();
			
			String[] animals1 = { "Dog", "Cat", "Mouse", "Bear", "Skunk" };
			
			for (String animal:animals1) {
				System.out.print(animal+" ");
			}
		}
	}






