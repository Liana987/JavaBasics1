package com.syntax.class04;

public class RecapClass03 {

	public static void main(String[] args) {
		//2 TYPES OF CASTING
		//widening/implicit castin
		//for example byte to short, smaller datatype and storing it inside a bigger type
		
		double d=1000;
		System.out.println(d);
		
		//narrowing/explicit casting
		//storaging bigger datatype and trying to convert it to smaller
		
		int i=(int)10.99;//error:type mismatch, cannot convert double into int
		System.out.println(i); 
		
		//Conditional statement:
		//If statement-based on the condition, specific action will be executed
		//Syntax:
		//If (boolean condition-true condition){
		//		CODE A
	//   } code A will be executed only if condition is true
		
		//If (true condition) {
		//codeA
		//}else {
		//code B
		
		//when there is the IF condition, JAVA is executing the statement based on the condition; ALWAYS ONLY ONE CONDITION CAN BE EXECUTE
		
		//  if (true condition) {
		//  code A;
		//  } else if (true condition) {
		//  code B
		//  } else if (true condition) {
		//  code C;
		// }
		
		
	 

	}

}
