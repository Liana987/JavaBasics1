package ReviewClass02;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);//Scanner object
		
		System.out.println("Please enter your age");
		int age=scanner.nextInt();
		
		//asking the computer to take the input from the keyboard;when we enter it , it is stored inside this age variable; nextInt can handle numbers ONLY
		//RESULT IS 25 and then we press ENTER it prints the below line//the number we type is stored into the age
		
		scanner.nextLine();//consumes the enter that user press after the number
		
		System.out.println("Please Enter your name");
		String name=scanner.nextLine();
		
		System.out.println(age+" "+name); 
		
		
		
		
		
		
	}

}
