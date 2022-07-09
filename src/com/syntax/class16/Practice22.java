package com.syntax.class16;

public class Practice22 {

	public static String thirdLetter(String s)
	    {
	        String result=String.valueOf(s.charAt(0));
	        for(int i=1;i<s.length();i++) {
	            if(i%3==0) {
	                result+=s.charAt(i);
	            }
	        } 
	        return result;
	    }
		
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(thirdLetter("hello there")); //"hltr"
			System.out.println(thirdLetter("technology")); //"thly"
		}
	}
