package com.syntax.class09;
import java.util.Arrays;

public class ReplHW {


		
		  
		  public static void main(String[] args) {
		    
		Scanner scan=new Scanner(System.in);
		    System.out.println("Please enter day of the week");
		    String day1=scan.next();
		    String day2=scan.next();
		    String day3=scan.next();
		    String day4=scan.next();
		    String day5=scan.next();
		    String day6=scan.next();
		    String day7=scan.next();
		     String[] week={day1, day2, day3, day4, day5, day6, day7};
		    for(int i=0; i<week.length; i++){
		      System.out.println(week[i]);
		    }}}