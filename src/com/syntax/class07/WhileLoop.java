package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {
		//Loops in JAVA-the same block of code will be executed n number of timesl=; 
		/*WHAT IT IS? 
		 * WHY? eliminate code redundancy
		 * HOW?
		 * 
		 */
//without having loops say Hello 5 times
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	//it will do the job but it is not necessary, so this is when loops come into picture
		//JAVA gives us variety of Loops
		//TYPES OF LOOPS
		/*
		 * WHILE
		 * DO WHILE
		 * FOR LOOP
		 * ENHANCED FOR LOOP/ADVANCED FOR LOOP/FOR EACH LOOP
		 * 
		 */
		//WHILE LOOP- repeats block of code based on the codition;
		
		int time=10;//if it was over 12 the code would not be executed because it is not true
		if(time<12) {
			System.out.println("Morning");//here JAVA executes once
			//instead of IF, i will type WHILE
			
			while(time<12) {
				System.out.println("Morning"); //infinite
				time++;//helps us stop Java from repeating
			}// we need to control the Loop by adding the variable counter
			//condition has to be true in order to execute the code
			
			
			
		}
	}
	
	

}
