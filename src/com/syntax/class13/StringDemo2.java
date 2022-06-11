package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="jksadhjaskhfsakjhf123463434fld$%^&*(";
		System.out.println(str.replaceAll("[0-9]", "#"));//replace all numbers from 0-9 with #
		//jksadhjaskhfsakjhf#########fld$%^&*(
		System.out.println(str.replaceAll("[a-z]", "#"));//replace all lower case a-z with #
		//##################123463434###$%^&*(
		System.out.println(str.replaceAll("[A-Z]", "#"));//replace all lower case a-z with #
		System.out.println(str.replaceAll("[A-Za-z]", "#"));//replace all lower AND upper case with #
		System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));//
		System.out.println(str.replaceAll("[^a-z]", "_"));//will replace everything except the stated
		//jksadhjaskhfsakjhf_________fld______
		System.out.println(str.replaceAll("[^A-Z]", "_"));
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "_"));//jksadhjaskhfsakjhf123463434fld______
		
		str="abcdefghijkl";
		System.out.println(str.replaceAll("[a-f]", "*"));
		str="sfkafdb18247t8725KSNDKASD!@#$((%^^";
		System.out.println(str.replaceAll("[^A-z]", "")); //remove the special characters
	}

}
