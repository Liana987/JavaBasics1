package com.syntax.class08;

public class BreakKeyword {

public static void main(String[] args) {
		
		//break - breaks block of code
		
	for(int i=1; i<=5; i++) {
		
		System.out.println("Hello");
		
		if(i==2) {
			break;
		}
	}
	//we use the break to break the loop. it will be inside the if statement
	boolean summer=true;
	int temp=95;
	
	while(summer) {
		
		if(temp<70) {
			System.out.println("It is not hot anymore");
			break;
		}
		System.out.println("It is hot"); 
		temp-=10;
	}
	
	
}
}
