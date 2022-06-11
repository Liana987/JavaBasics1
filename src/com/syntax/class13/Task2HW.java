package com.syntax.class13;

public class Task2HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a String and print it in reverse order(Sunday--- )
		
		String str="Sunday";
		for(int i=str.length()-1;i>=0;i--) {//doing -1 
			System.out.print(str.charAt(i));
		}

	}

}
