package com.syntax.class13;

public class HWnew2 {

	public static void main(String[] args) {
		// Create a String that should be combination of letters, numbers and special characters. Find out how 
		//many Alphanumeric characters are 
		//there in the String.
		
		String str="ashgdZASashd1234^*()(^";
		System.out.println(str.replaceAll("[^A-Za-z0-9]", ""));
		String str2;
		str2=str;
		System.out.println(str.length());
		
	}

}
