package ReviewClass04;

import java.util.Scanner;

public class WhileLoopDemo4 {

	public static void main(String[] args) {
		// take the input from the user using scanner
		//increment it by 2 print it
		//if value is 10 terminate the program
		int x=0;//we can put any number here since it will be replaced by the users input anyway
		Scanner scanner=new Scanner(System.in);
		while(x!=10) {//checking the condition;it should be true
			System.out.println("Please enter the number");
			x=scanner.nextInt();//input from user
			System.out.println(x+2);//increment the amount by 2 and then we check that is not 10 so we print the value and
			//program (loop) continues to execute
		}
		scanner.close();
		

	}

}
