package com.syntax.class06;

public class RecapClass5 {

	public static void main(String[] args) {
		
		//Logical operator-why and what?
		//WHY to use them- when we want to test 2 or more conditions
		//WHAT- &&. ||, !
		
		//How do they work?
		//AND &&-all conditions must be true
		
		boolean sunny=true;
		boolean hot=true;
		if(sunny && hot) {
			System.out.println("I will go to the beach");
		}
		//OR- one or the other condition to be true
		
		boolean checkboxSelected=false;
		if(!checkboxSelected) {System.out.println("I will click");
	}

}}
