package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		//Nested If is IF inside an IF
		//if (BOOLEAN EXPRESSION) {
		//code A; }
		//code A will get executed only if boolean expression is TRUE
		//when boolean expression is false, my code will not be executed
		
		//nested IF has its own boolean expression inside the first if statement
		
	// if (boolean expression) {  -----THIS CONDITION HAS TO BE TRUE IN ORDER TO EXECUTE NESTED IF; if it is false- no execution!
		//code A;
		// if (boolean expression) {     ------this is called nested (inner) IF (it always has a dependency on the outer,first IF mentioned that has to be TRUE
		// code B;}}
		
		boolean vaccine=true;
		
		if(vaccine){
			System.out.println("Let me check if you got a second dose");
		}

		boolean vaccine1=false;
		
		if(vaccine) {
			System.out.println("Let me check if you got a second dose");
		}
		
		boolean vaccine3=true;
		int dose=2;
		
		if(vaccine) {
			System.out.println("Let me check how many doses you have");
			
			if(dose==1) {
				System.out.println("You need 1 more shot");
			}else {
				System.out.println("You are fully vaccinated");
			}
		}
		
		String month="May";
		int day=8;
		
		if (month.equals("May")) {
			System.out.println("Let me check what is today's date");
			if (day==8) {
				System.out.println("Today is a Monther's Day");
			}
		} else if (month.equals("June")); 
	}}

		
		
		
	


