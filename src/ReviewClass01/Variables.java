package ReviewClass01;

import java.math.BigInteger;

public class Variables {
	
	public static void main(String[] args) {
		
		//String a="10";
		// String b="20";
		//System.out.println(a*b);   
		//will report error because you cannot multiply two strings, it has to be integer
		
		//Int a="10";
		//int b="20";
		//System.out.println(a*b); 
		
		//boxes to store numbers without decimal places
		byte smallestBox=127; //-128 to 127
		short slightluLargeBoz=16665; //-32768 to 32767
		int famousDataBox=21455555; //most of the time you guys will use this box to store whole number
		long notThatFamousBox=4545454545454L; //reason for using L There are specific suffixes for long (e.g. 39832L), float (e.g. 2.4f) and double (e.g. -7.832d).
		//If there is no suffix, and it is an integral type (e.g. 5623), it is assumed to be an int. If it is not an integral type (e.g. 3.14159), it is assumed to be a double.
		
		//EXAMPLE
		float f=12.555252344777777777777f;
		double d=12.555252344777777777777;
		System.out.println(f);
		System.out.println(d);
		
		//BigInteger i=new BigInteger(11225222522222222222222222222222222222222222222222);

		//always for whole numbers use int data type and for decimal numbers use double datatype
		
		char letter="a";
		System.out.println(letter);
		
		
	}

}
