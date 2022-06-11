package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Sameer is funny Sameer is gulbadan and he is sheer badan"; //array of characters
		//System.out.println(str.charAt(2)); //use this method in similar way as accessing arrays
		
		//for(int i=0; i<str.length(); i++) {
			//System.out.println(str.charAt(i));
		
		int counter=0;
				for(int i=0; i<str.length(); i++){
					if('s'==str.charAt(i)) {
						counter++;
					}
				}
				System.out.println(counter);
	
				for(int i=0; i<str.length(); i++){
					if('s'==str.charAt(i) || 'S'==str.charAt(i) || 'A'==str.charAt(i) || 'a'==str.charAt(i) ) {
						counter++;
					}
				}
				System.out.println(counter);
		}
	}


