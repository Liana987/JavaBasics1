package com.syntax.class13;

public class HWnew6 {

	public static void main(String[] args) {
		// How would you swap  2 strings without a temporary variable?
		
		String a="Good morning";
		String b="Good evening";
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());//now it is Good morning -switched
		a=a.substring(b.length());
		
		
		System.out.println("Here is a switched to b, meaning String a is now " + a + " and b switched to a, meaning String b is now " + b);
	}

}
