package com.syntax.class04;

import java.util.Scanner;

public class HwCompareNumbers {

	public static void main(String[] args) {
		
Scanner numbers=new Scanner(System.in);
System.out.println("Enter your first number");
int num=numbers.nextInt();
System.out.println("Enter your second number");
int num2=numbers.nextInt();

if(num>num2) {
	System.out.println(num + " is greater than " + num2);
} else System.out.println(num2 + " is greater than " + num);
	}

}
