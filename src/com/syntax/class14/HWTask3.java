package com.syntax.class14;

public class HWTask3 {

	//Create a method that will print whether given String is palindrome or not.
		void isPalindrome(String str) {
			str = str.toLowerCase();
			StringBuilder sb = new StringBuilder(str);
			sb=sb.reverse();
			String str1=sb.toString();
			if(str.equals(str1)) {
				System.out.println(str+" is a palindrome");
			} else {
				System.out.println(str+" is not a palindrome");
			}
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a string");
			String str = scanner.nextLine();
			HWTask3 task = new HWTask3();
			task.isPalindrome(str);
			scanner.close();

		}

	}
