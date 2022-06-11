package com.syntax.class14;

import java.util.Scanner;

public class HWTask1 {
	//Create a method that will take 2 parameters as a numbers and prints which number is larger.
		void whichIsLarger(int a, int b) {
			int max;
			if(a>b) {
				max = a;	
			} else {
				max = b;
			}
			System.out.println(max);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a numbers");
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			HWTask1 task = new HWTask1();
			task.whichIsLarger(a, b);
			scanner.close();

		}

	}
