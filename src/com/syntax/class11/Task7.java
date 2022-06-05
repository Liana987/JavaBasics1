package com.syntax.class11;

public class Task7 {

	public static void main(String[] args) {
		//Write a JAVA program to check whether the fiven number is prime or not?
		
		int x=15;
		boolean isPrime=true;
		if(x>1) {
			for(int i=2;i<x;i++) {
				if(x%i==0) {//if the number that user has provided if that number is completely
			isPrime=false;//divisible by any other number-we need to divide that number 
			break;
		}}} else {
			isPrime=false;
		}
		if(isPrime) {
			System.out.println((x + " is Prime "));
		} else {
			System.out.println(x+ " is not Prime");
		}


}}
