package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		
		//switch case is a great sub for if else if statement
		//switch case helps with the cleaniness
		//it is a conditional statement
		
		int day=3;
		String name;
		
		if (day==1) {
		name="Monday";
		}else if(day==2){
		name="Tuesday";
		}else if(day==3){ 
	    name= "Wednesday";
		}else if(day==4){
		name="Thursday";
		}else if(day==5){
		name="Friday";
		}else if(day==6){ 
			name="Saturday";
		}else if(day==7){
		name="Sunday";
		} else {
			name="invalid";//else is optional and it is always a last block
		}
			System.out.println(name);

			System.out.println("--------------------------------------");
			
			switch(day) { //multiple value for my variable, can replace the IF ELSE statement
			// switch case works based on the VALUE and NOT the condition,it is value based
			//if is a condition based on a statement, switch is a value based statement; 
			case 1:
				name="Monday";
				break;		//it breaks block of code between cases
			case 2:
				name="Tuesday";
				break;
			case 3:
				name="Wednesday";
				break;
			case 4:
				name="Thursday";
				break;
			case 5:
				name="Friday";
				break;
			case 6:
				name="Saturday";
				break;
			case 7:
				name="Sunday";
				break;
			default: //switches the ELSE statement when none of the conditions is true
				name="Invalid";
				break;//default can be placed anywhere but we should use it in the end of the code;
			}
			System.out.println(name);
	}

}
