package com.syntax.class14;

import java.util.Scanner;
public class HWTask2 {

	
		

		//Create a method that will take a number and prints whether the number is even or odd.
	
		void isEven(int num) {
			if(num%2 == 0) {
				System.out.println(num+" is even");
			} else {
				System.out.println(num+" is odd");
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number");
			int num = scanner.nextInt();
			HWTask2 task = new HWTask2();
			task.isEven(num);
			scanner.close();
		}

	}