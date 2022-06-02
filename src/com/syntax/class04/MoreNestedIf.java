package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		
		boolean didRepl=true;
		int assignments;
		
		if (didRepl) {
			System.out.println("How many assignments have you done");
			assignments=14;
			
			if (assignments>15) {
				System.out.println("You did a great job");
			}else if (assignments >10) {
				System.out.println("You did a good job");
			}else {                                                              //this else belongs to the number of assignments to the inner part
				System.out.println("Please complete all repl assignment");
			}
		}else {                                                                   //this else belongs to the Repl not the assignment
			System.out.println("You should complete your Repl HW");
		}
	}
	

	
	boolean didRepl1=true;
	int assignments1  //variable declaration
	
	 if (didRepl1) {
		System.out.println("How many assignments have you done");
		assignments1=5;   //variable initilization
		
		if (assignments1>15) {
			System.out.println("You did a great job");
		}else if (assignments1 >10) {
			System.out.println("You did a good job");
		}else {                                                              //this else belongs to the number of assignments to the inner part
			System.out.println("Please complete all repl assignment");
		}
	} else {                                                                   //this else belongs to the Repl not the assignment
		System.out.println("You should complete your Repl HW");
	}


}}
