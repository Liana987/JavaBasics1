package com.syntax.class04;

import java.util.Scanner;

public class HomeworkScanner {

	public static void main(String[] args) {
				
				Scanner scannerFirst=new Scanner(System.in);
				
				System.out.println("Please enter your first name");
				String name=scannerFirst.nextLine();
				System.out.println("Please enter your last name");
				String last=scannerFirst.next();
				System.out.println("Enter your state");
				String state=scannerFirst.next();
				
				System.out.println("My name is " + name + "\n" + "My last name is " + last + "\n" + "I live in "+ state + "\n");
				
				
				
				

	}

}
