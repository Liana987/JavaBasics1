package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		//whenever we have multiple conditions to test we use IF ELSE IF
		/*declare 2 number and verify which one is the largest one
		 * 
		 */
		int num1=200;
		int num2=67;
		
		if(num1>num2) {
			System.out.println(num1+" is the larger than "+num2);
		
		} else {
			System.out.println(num2+ " is the larger than "+num1);
		}

         // this statement used to test varius conditions
		//IF always works with only BOOLEAN expression (true or false)
		//this type of IF STATEMENT we call LADDER IF
		//whenever we have IF ELSE IF statement- check the code by providing the different values in the code
	
            int day=6;
            
            if (day==1) {
            	System.out.println("Monday");
            }else if(day==2) {
            	System.out.println("Tuesday");
            }else if(day==3) {
            	System.out.println("Wednesday");
            }else if(day==4) {
            	System.out.println("Thursday");
            }else if(day==5) {
            	System.out.println("Friday");
            }else if(day==6) {
            	System.out.println("Saturday");
            }else if(day==7) {
            	System.out.println("Sunday");
            }
	}}

	
