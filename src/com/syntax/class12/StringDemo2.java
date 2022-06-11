package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName="Adem";
		String lastName="jones";
		String fullName=firstName+lastName;//ALWAYS ALWAYS PREFER THIS
		String fullName2=firstName.concat(lastName);// never use this 
		//when you need to concationation
		//because it can lead you to nullpointer
		System.out.println(fullName2);
		System.out.println(fullName);
		
		String name=" ";
		System.out.println(name.isEmpty());
		//System.out.println(name.isBlank());//not supported by my JDK version,
		//this method was supported by JAVA 11
		
		String str=" never ";
		System.out.println(str.trim());//trim method removes only spaces on the 
		//beginning or end, not in the middle.
		
		
	}

}
