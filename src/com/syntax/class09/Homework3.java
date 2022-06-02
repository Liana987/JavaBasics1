package com.syntax.class09;

public class Homework3 {

	public static void main(String[] args) {
		// Create an array to store double values and then print all elements using 2
		// different loops
		
		double[] value = {25.99, 45.45, 99.99, 44.44};
			
		for(double val:value) {
			System.out.print(val+" ");
		}
		
		System.out.println();
		
		
		double[] value1 = {25.99, 45.45, 99.99, 44.44};
		
		for(int i=0; i<value1.length; i++) {
			System.out.print(value1[i]+" ");
		}
	}
}









