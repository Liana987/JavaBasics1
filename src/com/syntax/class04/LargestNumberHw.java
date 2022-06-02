package com.syntax.class04;

public class LargestNumberHw {

	public static void main(String[] args) {
		// 3. Write a program to find largest number among three numbers using nested if provided by a user (numbers must be distinct)

		int num=15;
		int num2=25;
		int num3=55;
		
		if (num<num2 && num3<num2) {
			System.out.println(num2 + " is greater than " + num + " and " + num3);
		} else if (num2<num && num3<num) {
			System.out.println(num + " is greater than " + num2+ " and " + num3 );
		} else if (num<num3 &&num2<num3){
			System.out.println(num3+ " is greater than " + num + " and "+ num2 );
		}else
			System.out.println("All three numbers are equal");
			
	}

}
