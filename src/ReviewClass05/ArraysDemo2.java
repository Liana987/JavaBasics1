package ReviewClass05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo2 {

	public static void main(String[] args) {
		// Loop and Arrays use together
		
		String [] names=new String[5];//created an empty array of size 5 to store String type values
		names[0]="Ahmed";
		names[1]="Kaiser";
		names[2]="Abdulsamad";
		names[3]="Zameer";
		names[4]="Elisa";
		//the maximum index, memory location inside this array is 5 and since they are starting from 0, we can go maximum up to 4; 0 1 2 3 4
		//if I want to go beyond 4-we get an error
		
		//names[5]="Error";
		
		Scanner scan=new Scanner(System.in);
		names[0]=scan.next();
		names[1]=scan.next();
		names[2]=scan.next();
		names[3]=scan.next();
		names[4]=scan.next();
		
		System.out.println(Arrays.toString(names));//prints the value of the array without loop

	}

}


		
		