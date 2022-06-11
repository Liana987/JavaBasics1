package com.syntax.class13;

public class Recap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//from a String get the part which starts from the symbol # and ends at the symbol #
		String str="I am #Confused#";
		System.out.println(str.substring(5));//ignores the letters before this index, starts the output
		//from index 5
		System.out.println(str.substring(2,4));//we can pass two parametrs, for example intereste in AM only
		//looks between the indexes,first index is INCLUDED but the second index is EXCLUDED
		str="Liana is great";
		System.out.println(str.substring(0,5));
		
	}

}
