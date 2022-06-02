package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// Logical NOT is use with the = sign, reverses the condition
		
		boolean traffic=false;
		
		if(!traffic) {
			System.out.println("I will reach on time");
		}
		
		String name="Reza";
		
		if (!name.equals("Emre")) {
			System.out.println("You are not Emre, and I need Emre");
		}

	}

}
