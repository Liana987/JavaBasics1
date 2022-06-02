package ReviewClass03;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the name of the country");
		String country=scanner.nextLine();
		String capital = null;
		
		switch(country) {
		case"Turkey":
			System.out.println("Ankara");
			break;
		case"USA":
			System.out.println("DC");
			break;
		case"Serbia":
		System.out.println("Belgrade");
		break;
		default:
			capital="Either country name is included correct or its not a country";
		
		} System.out.println(capital);
		scanner.close();

	}}
