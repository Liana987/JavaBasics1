package com.syntax.class07;

import java.util.Scanner;

public class HWCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		double x = scan.nextInt();
		double y = scan.nextInt();
		System.out.println("Please enter operator");
		char op = scan.next().charAt(0);//we use this in order to capture only first operaator
		double result = 0;//
		String operator=null; //introduced additional variable NULL(no value) so that when the result is 0 (5-5), the result is 0
		switch (op) {
		case '*':
		result = x * y;
		break;
		case '/':
		result = x / y;
		break;
		case '+':
		result = x + y;
		break;
		case '-':
		result = x - y;
		break;//using break Java was exiting this and going to the is statement
		default:
		System.out.println("Invalid Operator");
		operator="Invalid";
		}
		if (result != 0 || operator==null) {//when it comes to objects there is a difference between null and " "
			//null- there is nothing inside the string but with emptu-specified that it exists
		System.out.println(x + " " + op + " " + y + " = " + result);
		}
		scan.close();//data we have coming from somewhere, we need to make sure we use option CLOSE(Scanner is also an object)
		}
		}