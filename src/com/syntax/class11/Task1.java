package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		//Using Scanner create an array of integer values.After the array is created,
		//calculate the sum of all stored elements in that array.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the size of the array that you want to create");
		int arraySize=scanner.nextInt();
		
	System.out.println("The size of the array is " + arraySize);//asking the user for the size of an array
	int [] integerArray=new int[arraySize];//using scanner object and using the input from the user and store inside arraysize variable
	//there are no indexes in the enhanced for
	//loop so we cannot use it for inserting or updatingthe values of an array
	System.out.println("Please enter " + arraySize + " elements ");
	for(int i=0; i<integerArray.length; i++) {//created an Array of that size with this line
		integerArray[i]=scanner.nextInt();//take the value form the user with the Scanner and store inside the Array
	}
	System.out.println(Arrays.toString(integerArray));//printing elements of an array
	
	int sum=0;
	for(int element:integerArray) {//ehanced for loop where we are accessing the elements from an array and adding those to the variable sum
		sum=sum+element;
	}
	System.out.println("The sum of all the elements is "+ sum);
	scanner.close(); 
	}

}
