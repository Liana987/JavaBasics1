package com.syntax.class02;

public class WaysToCreateVariable {

	public static void main(String[] args) {
		//to create a variable we need 2 things: datatype & name
				/*first way to create a variable
				 * dataType name=value
				 *//declare a variable and we initialized it 
				 */
				int temperature=60;
				/* second way is done in 2 steps
				 * create a variable (dataType and name)
				 * assign the value
				 */
				int sum;//here we have just declared the dataType
				//created a variable or in other words to declare a variable
				sum=30;//here we added the value-no need to again specify the variable as it was created already
				//this is used in the situation when we know we will need the container but we still do not know the value
				sum=50; //reassign the value
				
				int num1,num2,num3; //create 3 variables of int type
				num1=10; //assign the value
				num2=20;//assign the value
				num3=30;//assign the value
				
				System.out.println(sum);//50

	}

}
