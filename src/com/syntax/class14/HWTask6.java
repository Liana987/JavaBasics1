package com.syntax.class14;

public class HWTask6 {
	//Write a method to return whether given number is prime or not?
	
	boolean isPrime(int num) {
		boolean isPrime = true;
		for(int i=2; i<num/2; i++) {
			if(num%i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
	
		HWTask6 task = new HWTask6();
		boolean isPrime = task.isPrime(7);
		if(isPrime) {
			System.out.println("Is prime");
		} else {
			System.out.println("Is not prime");
		}
	}

}