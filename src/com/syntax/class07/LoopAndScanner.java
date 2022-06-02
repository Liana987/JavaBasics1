package com.syntax.class07;

import java.util.Scanner;

public class LoopAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String offer;
		System.out.println("Did you get a job");
		offer = input.nextLine();
		while (!offer.equalsIgnoreCase("yes")) {
		System.out.println("Did you get a job");
		offer = input.nextLine();
		}
		System.out.println("Congratulations");
		}
		}
