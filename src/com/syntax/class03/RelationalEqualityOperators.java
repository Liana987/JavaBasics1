package com.syntax.class03;

public class RelationalEqualityOperators {

	public static void main(String[] args) {
		
		//RELATIONAL OPERATORS used to compare numeric values
		// > , < , >= , <= , == , !=
		//the result is always true or false (boolean)
		
		int num1=20;
		int num2=22;
		
		System.out.println(num1>num2); //false
		System.out.println(num1<num2);//true
		System.out.println(num1!=num2); //true (NUM1 NOT EQUAL TO NUM2)
		
		System.out.println(num1==num2);//no=false
		System.out.println(num1=num2);//reassigning since = is a assignment operator; 20 is becoming 22;//22
		
		System.out.println(num1==num2);//true
		
		boolean result=100>200;// result of the relational operator is always a BOOLEAN
		System.out.println(result);
		
		int result1=100+200; //integer type, not relation operator
		System.out.println(result1);
		
		String result2="Emre"+10;
		System.out.println(result2);
		
		int num3=10;
		int num4=11;
		
		result=num3==num4;
		System.out.println(result); //false
		
		result=num3!=num4; //check if num3 NOT equal to num4
		System.out.println(result);//true
		
		//be careful that only numberic goes with numeric, you cannot convert from boolean to int
		
		//we are using the relational operators within IF STATEMENT
		
	}

}
