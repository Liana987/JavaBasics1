package com.syntax.class03;

public class PrimitivesCasting {

	public static void main(String[] args) {
		
		//ctrl+space ---> auto complete
		
		//main method -    main + ctrl + enter
		//syso + ctrl + enter
		
		int i=100;
		double d=100; //integer value was switched to double (decimal value)
		//it has become CASTING -converting one data type to another type
		
		System.out.println(i);//100
		System.out.println(d);//100.0
		
		//there are two types of Casting: 
		//widening (converting smaller data type into a larger datatype)
		//byte--->short--> int --->long--->float---> double
		//Java will automatically recognize and the process happens automatically. When it happens automatically we call it happening implicitly
		
		
		//narrowing-going from the bigger datatype and trying to store it inside a smaller datatype- also called explicit(manual) casting
		//double--->float-->long-->int-->short-->byte
		//converting eg. 
		
		//error: Type mismatch;cannot convert from double to -  int int x=99.99
		int x=(int)99.99;
		System.out.println(x);//99
		
		 //type mismatch:cannot convert from int to byte byte b=130;
		byte b=(byte)130;
		System.out.println(b);//-126
		
		//Casting is a process of changing one datatype into another datatype
		
		//type mismatch:cannot convert from double to float
		
		float f=10.99f;
		double dd=9.99;
		double price=100;
		
		
		
	}
	    

	}

