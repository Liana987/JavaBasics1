package com.syntax.class13;

public class HWnew3 {

	public static void main(String[] args) {
		//You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
		//How would you find out how many sentences are in that String?
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		int counter=0;
		for(int i=0; i<a.length();i++) {
			if(a.charAt(i)=='?') {
			counter++;
				
			}
		}
	
		System.out.println(counter);
	}

}
