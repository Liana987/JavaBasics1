package com.syntax.class06;

public class EnhancedLargestNumber {

	public static void main(String[] args) {
		//Code from class 5 LogicalAnd
		
		int num1=2000;
		int num2=200;        //compiler does not look at the values but for the possibilities,then introducing the default value
		int num3=20; //Unresolved compilation problem when missing ;
		
				//after the code is written, it is being compiled and transffered to binary code from the source code
				//complilation - compiler (checker of the program)
				//it wants to make sure our code is correct so that JAVA can take the code and execute
		
		int largest = 0;//here it is only declared, the value is still not stored, compiler sees the mistake and there are two ways to resolve:
		//we can either add the else block and we need to add the initilization - else {syso...."All numbers are equall";largest=num1;
		/* OR second way- compiler can initilize variables to it's default values
		 * int default value- 0
		 * double default value- 0.0
		 * float default value- 0.0
		 * boolean-default value false
		 * string- default value-null
		 */
		
		if (num1>num2 && num1>num3) {//if all values the same,num1 =20, num2=20, num3=20 none of the code will be executed since there would be no "else"
			largest=num1;
		} else if (num3>num1 && num3>num2) {
			largest=num3;
		} else if (num2>num1 && num2>num3) {
			largest=num2;
		}
			if (largest!=0) {
				System.out.println("The largest number is "+ largest);
			}
			//The variable largest may not have been initialized-we need to initialize it-in situation when all the statements are false
		}
	//largest=num1=num2=num3;-actually initiliazing



	}


