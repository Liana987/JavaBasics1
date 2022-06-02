package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		//Create a Java program and name it Variables. In your program create different type of variables to store student’s information(name, last name, grade, city, state, phone number) and then print value of those variables in the format:
//		My name is ___ and my last name is ____
	

		String name="Liana";
		String lastName="Horvat.";
		String grade="A";
		String city="Chicago";
		String state="Illinois";
		String phoneNumber="774-563-5048";
		
		
			System.out.println("My name is " + name+" and my last name is "+lastName);
			System.out.println("I am a "+ grade + " student.");
			System.out.println("I live in "+ city + " and state " + state);
			System.out.println("My phone number is " + phoneNumber);
			
			
			
			grade="B";
			city="Miami";
			state="Florida";
			phoneNumber="063-856-573";
			
			System.out.println("My name is " + name + " and I moved to a new city " + city + " and a new state " + state);
			System.out.println("My new phone number is " + phoneNumber);

	}

}
