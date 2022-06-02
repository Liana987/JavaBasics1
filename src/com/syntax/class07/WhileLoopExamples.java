package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		//as long the condition is true, WHILE will be repeating the code
		//print numbers from 1 to 10;
		
		int num=1;
		while (num<10) {
			//if num++ was here 1+1
			System.out.println("num");//if I want to print everything in one line I would only delete LN
			num++;//if I want to print with space in betweekn in the syso (num+ " ");
		}
		//int num1=0;
		//while(num1<10) {
			//System.out.println(num1+" ");
		
		//print numbers from 10 to 100;
		
	
		int a=10;
		
		while(a<=100) {
			System.out.println(a+ " ");
			a++;
		//print number from 10 to 1;
			System.out.println();
			
		int b=10;
		while(b>=1) {
			System.out.print(b+ " ");
			b--;
		}
		//print numbers from 100 to 50;
		
		int c=100;
		while (c>=50) {
			System.out.println(c+ " ");
			c--;
		}
		//print number from -1 to -10
		
		int d=-1;
		while (d<=-10) {
			System.out.println(d+ " ");
			d--;
			
			//print numbers from 1 to 20 but only even numbers
			
			int e=2; //can start from  2 as well since it is even numbers
			while(e<=20) {
				System.out.print(e+ " ");
				e=e+2;//or compound e+=2;
			}
			
			//2 way
			
			int f=1;
			while(f<=20) {
				if (f%2==0) {
					System.out.println(f + " ");
					f++;
				}
			}
			
		}
		
		// Print only odd numbers from 100 to 1
		System.out.println();
		int r = 100;
		while (r >= 1) {
		if (r % 2 != 0) {
		System.out.print(r + " ");
		}
		r--;
		}
		//another way
		System.out.println();
		int y=99;
		while (y>=1) {
		System.out.print(y+" ");
		y-=2;
	}

}}}
