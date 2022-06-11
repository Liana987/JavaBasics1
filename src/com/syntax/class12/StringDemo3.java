package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Batch 13 is Great";
		System.out.println(str.startsWith("Batch"));//the sentence really starts with Batch
		
		//if we want to check if something ends with a letter or a word, we use the phase
		//.endsWith. Here is an example:
		
		System.out.println(str.endsWith("t"));//true
		System.out.println(str.endsWith("Great")); //true
		System.out.println(str.endsWith("great")); //false because it is case sensitive
		System.out.println(str.toLowerCase().endsWith("great")); //now it shows true
		
		String name="HAMID";
		System.out.println(name.toLowerCase());
		System.out.println(name);
		
		String query="13";
		System.out.println(str.contains("query"));
		System.out.println(str.contains("is"));
		System.out.println(str.toLowerCase().contains("batch")); //contains looking for something inside your string
	
		
	
	
	}

}
