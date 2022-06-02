package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		//ArithmeticOperators have to have numeric values ( +, - ,/,*%)
		
			int num1=40;
			int num2=20;
			int sum,sub,mult,div;
			
			System.out.println(num1 - num2);//20
			
			
			sum=num1+num2;
			System.out.println(sum);//60
			
			sub=num1-num2;
			System.out.println(sub);//20
			
			mult=num1*num2;
					System.out.println(mult);//800
			div=num1/num2;
			System.out.println(div);//2
			
			double num3=9.99;//when adding two decimas, it will give me the result the decimals
			double num4=3.50;
			
			//sum=num3+num4; //cannot do it because of the decimals this way
			double sum1, sub1, mult1, div1;
			sum1=num3+num4;
			
			int a=10;
			int b=3;
			
			int result=a/b;
			System.out.println(result);//3
			//the result is 3 so since we are doing division, it is taking the whole number because it is an integer and not decimal;
			

	}

}
