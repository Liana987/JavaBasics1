package com.syntax.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// increment the valuable by 1
		int x=10;
		x=x+1;
		x+=1;
		System.out.println(x);//12
		
		x++;// increments value of a variable by 1
		System.out.println(x);//13
		
		x--;//decrement value of a variable by 1
		System.out.println(x);//12
//incremment and decrement operators  work only with variables
		//for examle 10++; COMPILER ERROR:INVALID ARGUMENT TO OPERATION ++/--(it has to be a variale)
		
		int num=100;
		num++;
		System.out.println(num);
		 
		
	}

}
