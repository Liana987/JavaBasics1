package com.syntax.class13;

import java.util.Scanner;

public class HWtask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// How would you check if String is palindrome or not? aba=> true
		//Abbc =>false
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("In:");
		String array= scan.nextLine();
		
		boolean IsPal=true;
		
		String newString=array.replaceAll(" ","");
		String rev = null;
		
		for(int i=newString.length()-1;i>0;i--) {
			rev+=newString.charAt(i);}
			boolean isPal;
			if(newString.equals(rev)) {
				isPal=false;
			}else
				isPal=true;}
	System.out.println(isPal);

}
