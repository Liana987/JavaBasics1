package com.syntax.class11;

public class PracticeObjeDoggie {


		// TODO Auto-generated method stub

		//attributes how the object will look like
		String name; 
		int age;
		double weight;// properties attributes fields
		String color;
		double height;
		String breed;
		
		// how the object will behave
		void bark() {
			System.out.println("Dog barks");
		} 
		void walks() {
			System.out.println("Dog walks");
		}
		void eat() {
			System.out.println("Dogs like to eat bone");
		}
		public static void main(String[] args) {
			
			//Scanner scanner=new Scanner(System.in);//hold CTRL + "Scanner"
			//scanner.next();
			
			PracticeObjeDoggie jimmy= new PracticeObjeDoggie(); //creat
			jimmy.name="Jimmy";
			jimmy.age=6;
			jimmy.weight=16;
			jimmy.color="Pink";
			jimmy.height=2.6;
			jimmy.breed="German";
			jimmy.bark();
			//new Dog() how we create an object
		}
	
			
		}
	


