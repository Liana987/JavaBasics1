package com.syntax.class16;

public class SyntaxEmployee {
	
	//Create a Class called SyntaxEmployee:
//Create three  variables  empID , salary and set the CEO to “Sumair”
//Create two objects of the class SyntaxEmployee
//Set the value of eID, salary for each of the objects
//Print out the eID , salary and  CEO for each of the objects
	
	static int empID;
	static int salary;
	static String ceo = "Sumair";
	
	public static void main(String[] args) {
		
		SyntaxEmployee emp1 = new SyntaxEmployee();
		emp1.empID=1;
		emp1.salary=100000;
		
		System.out.println("For the employee ID: " + emp1.empID + "and the salary is: " + emp1.salary + " where the CEO is " + ceo);
		
		SyntaxEmployee emp2 = new SyntaxEmployee();
		emp2.empID=2;
		emp2.salary=200000;
		
		
		System.out.println("For the employee ID: " + emp2.empID + "and the salary is: " + emp2.salary + " where the CEO is " + ceo);
		
	}
			

}
