package com.syntax.class13;

public class Recap {
	
	public static void main(String[] args) {
		
		String str="Batch 13 is great but I say this to every batch. I was kidding";
		System.out.println();
		str.length();// no output since methods that we have created are different methods,
		//it has to have a printout. 
		int len=str.length();
		System.out.println(str.toUpperCase());
		str=str.toUpperCase();
		System.out.println(str);
		str=" ";
		System.out.println(str.isEmpty());
		
		String str2="Tara       ";//if I want to get rid of the spaces, use the  trim method
		System.out.println(str2.trim());
		str="Batch 13 is great but I say this to every batch.Iwas kidding";
		System.out.println(str.contains("b"));//true
		System.out.println(str.contains("z"));//false
		System.out.println(str.startsWith("Batch")); //true
		System.out.println(str.endsWith("kidding")); //true
		
	}

}
