package com.syntax.class08;

public class Homework1 {

	public static void main(String[] args) {
		//Using nested loop, create a 24 hour clock that will display 2 digits 
		//for an hour and 2 digits for a minute.
		//Example:10:00 10:01 10:02 	…..etc 10:59 11:00
		
		for(int a=0;a<24;a++) {
			for(int b=0;b<60;b++) {
				if(a<=9 && b<=9) {
					System.out.println(("0"+ a +":0"+ b));
				}else if(a>9 && b<=9) {
					System.out.println(a+ ":0"+b);
				}else if (a<=9 && b>=9) {
					System.out.println("0"+a+":"+b);
				}else if(a>=9 && b>=9) {
					System.out.println(a+":"+b);
				}
			}
		
		}		
}
}
