package com.syntax.class03;

public class AdditionOrConcatenation {

	public static void main(String[] args) {
	 
		int a=10;
		int b=20;
		
		String c="Hello";
		String d="Hi";
		
		System.out.println(a+b+c+d);//30HelloHi
		System.out.println(a+c+b+d);//10Hello20Hi
		System.out.println(c+d+a+b);//HelloHi1020; 	HelloHi is a STRING and we are adding a + as a concatenation HelloHi10 and adding 20 as well
		System.out.println(c+d+(a+b));//HelloHi30
		
		boolean boo=true;
		System.out.println(c+boo);//as long as one value is a String value the + acts as a concatenation
		
		
		

	}

}
