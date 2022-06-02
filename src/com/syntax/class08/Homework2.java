package com.syntax.class08;
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// Write a program that reads a range of integers (start and end point), 
		//provided by a user and then from that range prints the sum of the even and odd integers.

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=scan.nextInt();
		System.out.println("Enter another number");
		int b=scan.nextInt();
		int sum=0;
		int sum1=0;
		
		for(int i=a;i<=b;i++) {
			if (i%2==0) {
				sum=sum+i;
			}else {sum1=sum1+i;
		}}
		System.out.println("Sum of all even numbers from "+a + " to "+ b +" is "+sum);
		System.out.println("Sum of all odd numbers from "+a + " to "+ b +" is "+sum1);
		
		
		
		
		
	}

}
