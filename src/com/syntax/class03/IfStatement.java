package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
	
		//Conditional statements
		//the first one is IF statement
		//if the condition is TRUE it will perform one operation
		//If there is rain outisde I will take an umbrella
		
		/*
		 * declare a variable RATE
		 * If rate is more than 5--->I am not byuing a house.
		 * u zagradi nakon reci IF treba ubaciti condition we need to specify a block of code with the curly braces
		 * 
		 *when my condition is TRUE (and only when it is true) it allows the IF statement
		 
		 */

		double mortgageRate=5.5;
		
		if (mortgageRate>5) {
			
			System.out.println("I am not buying a house");
			
	    double mortgageRate1=4.5;
	    
	    if (mortgageRate1>5) {//when it is false, the JAVA does not let you to do the SYSO block code and the result is there is no result)
	    	//System.out.println(); not allowed when FALSE
	    }
		/*
		 * declare 2 variables and check if num1 is bigger than num2
		 */
	    int num1=99;
	    int num2=10;
	    
	    if(num1>num2) {
	    	System.out.println(num1+ " is bigger than " + num2);
	    }
	    
	    /*declare a temperature, if temperature is higher than 75 degrees I will go for a walk
	     * 
	     */
	    
	    int temp=68;
	    If(temp>75) {//code goes inside if{}
	    	//when condition is false
	    	
	    	System.out.println("I will go for a walk");
	    }else { //otherwise.Code comes to else {} 
	    	//when condition is false
	    	System.out.println("I am going to study Java");
	    }
	    
		/*WHEN YOUR CODE HAS NO ERRORS ALWAYS TRY TO FORMAT IT
		 * WINDOWS CTRL+SHIFT+F
		 * MAC CMD+SHIFT+F
		 */
	    //CHAR
	    
	    
	    //STRING
