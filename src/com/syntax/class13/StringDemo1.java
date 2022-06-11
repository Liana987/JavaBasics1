package com.syntax.class13;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Batch 13 is good actually very good";
		System.out.println(str.replace("good", "Great"));//we can replace complete words
		System.out.println(str.replace("g", "G"));//we can replace one letter,if more than 
		//one letter in a sentence, it will replace all of them
		System.out.println(str.replaceFirst("g","G"));//replaces only first one not the second one
		
	}

}
