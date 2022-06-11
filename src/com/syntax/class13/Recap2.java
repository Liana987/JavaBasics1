package com.syntax.class13;

public class Recap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Where is sameer?";
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("e"));
		
		System.out.println(str.indexOf("e",6));//it will ignore the first 6 letters and 
		//start the search from the
		//number 6 
		System.out.println(str.indexOf("e",2));//index always start from 0
		System.out.println(str.indexOf("r",5)); //it ignores the first 5 letters 
//and counts at what spot it finds r, it
		//doues count the first 5 ignored but still counts it (just states where to start the search
		
		int counter=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='e') {
				counter++;
				if(counter==2) {//index of 2nd occurence
					System.out.println(i);
				}
			}
		}
		
		
	}

}
