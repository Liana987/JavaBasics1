package ReviewClass05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=scanner.nextInt(); //asks for the size of an array
		String[] names=new String[size];//an array of Strings of that size is created
		for(int i=0;i<names.length; i++) {
			names[i]=scanner.next();//fill the array with the input from the user
		}
		System.out.println(Arrays.toString(names));//print the contents of array

	}

}
