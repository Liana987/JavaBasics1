package com.syntax.class12;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String name=new String("Oleg"); //proper way of creating an object from a class
			
			String name2="Oleg"; //its the same as String name= new String("Oleg);
			//All the classes in java can be treated as data types
			//if a class is present inside the same package or if a class belongs to java.lan package
			
			//name.length();//how many characters are present in this object
			System.out.println(name.length()); //-Oleg-4
			name2="Zameer ";//even space is counted as 1
			System.out.println(name2.length()); //Zameer -7
			// length method for class, length for arrays is different
			
			String captain="NAVEED";
			System.out.println(captain.toLowerCase());
			captain="I love Java";
			System.out.println(captain. 
	}

}
