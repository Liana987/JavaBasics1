package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] disney={"Shrek","Elsa","Goofy","Mulan"};
		int size=disney.length;
		System.out.println(size);//4
		System.out.println(disney[1]); //Elsa
		System.out.println(disney[4]);//RE:ArrayIndexOutOfBoundsException
		
		String[] iceCream=new String[3];//we are storing the elements based on indexes( 0,1,2)
		
		iceCream[0]="butter pecan";
		iceCream[1]="chocolate";
		
		System.out.println(iceCream[2]);//valuie is not there so it will be NULL
	}

}
