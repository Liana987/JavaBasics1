package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		String name="Oleg";
		String lastName="Smith";
		long phone=1234567890l;
		//xxx-xxx-xxxx
		
		String phoneNumber="123-456-7890";
		String address="123 Washington str";
		
		int age=30;
		String city= "Miami";
		
		//shortcut for printing System.out command
		//----> type syso + ctrl + space and hit enter
		//System.out.println();
		//we can use + ---> works as a concatenation operator 
		//to attach String to String
		//to attach String to int
		//to attach String to double
		
		System.out.println(name + lastName);//Oleg Smith
		
		//when we want to attach String to String we can use + to attach String to String 
		
		//to attach the space between the String add the +" "+
		System.out.println(name +" "+ lastName);//Oleg Smith
		
     //Oleg lives in Miami- when attaching two string add + (contectation operator).Plus can be added to any dataType
		
		System.out.println(name+ " lives in "+city);
		
		//Oleg is 30 years old.
	
		System.out.println(name+" is "+age+" "+ "years old");
		
		/*Rules for identifiers
		 * 1.no space
		 * 2.no keywords
		 * 3. cannot start with the numbers (numbers can be used after)
		 * 4.identifiers cannot have a special characters (except _ and $ )
		 
		 */
		//String break="Hello";
		//int 1number=10; int num%=20;
		int number1=10;
		double $price=3.99;
		//int num20%- error
		float f_=2.09f;
		
		/*Naming conventions:
		 * follow camel casing
		 * variable/methods names should start with lower case and then follow camel casing
		 * class names should start with uppercase
		 * 
		 //String MyCity
		 */
		
		//variable-placeholder/box/container
		//Operators:
		/*Assignment operator =
		 * Arithmetic Operators +, - , * , / , %
		 */

	}

}
