package com.syntax.class04;

public class HwDonor {

	public static void main(String[] args) {
		
		// 2. Create a Java program and call it a Donor.
//In order to be eligible to donate your blood you have to be 18 years old. Also once you identify age eligibility then we have to see if person matches weight requirements. 
//If person weight it more than 110 lbs then he/she is eligible, otherwise we cannot accept such a patient.

		int age=34;
		float weight=150;
		
		if(age==18 && weight>110) {
			System.out.println("You are eligible to donate blood");
		} else System.out.println("You are not eligible to donate blood");
		
	}

}
