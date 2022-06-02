package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.
		
		int[] array= {5,10,15,25};
		int largest=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>largest) {
				largest=array[i];
			}
		} System.out.println(largest);

	}

}
