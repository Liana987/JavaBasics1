package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		
		char choice='Y';
		String meaning;
		//VARIABLE AND MATCHING CASES MUST BE OF SAME TYPE
		//SWITCH CASE DOES NOT ALLOW TO HAVE DUPLICATED CASES
		switch(choice) {
		
		case 'Y':
		meaning="Yes";
		break;
		case 'M':
		meaning= "Maybe";
		break;
		case 'N':
		meaning="No";
		break;
		default:
			meaning="Unknown";

	}
		System.out.println(meaning);

}}
