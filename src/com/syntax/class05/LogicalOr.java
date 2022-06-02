package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		//We go for a LOGICAL OR when we want at least one condition is TRUE
		//true || true --- TRUE
		//true || false ---TRUE
		//false || true --- TRUE
		//false || false --- FALSE
		
		
		
		//Mon and Fri--- no class
		// Tuesday and Wed--- Manual testing
		//Thursday ---- Review
		//Saturday and Sunday----Java
		
		String day="Monday";
		
		if(day.equals("Monday") || day.equals("Friday")) {
			System.out.println("I have no class");
		} else if (day.equals("Tuesday") || day.equals("Wednesday"))  {
			System.out.println("I have manual testing class");
		} else if (day.equals("Thursday"))  {
			System.out.println("I have a review class");
		} else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have a Java class");
		}
			


	}

}
