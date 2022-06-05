package com.syntax.class11;

public class Car {
	
	String model;
	String make;
	String color;
	int year;
	String typeOfEngine;
	int HP;
	
	void MoveForward() {
		System.out.println("Car is moving forward");
	}
	void reverse() {
		System.out.println("Moving backwards");}
		
		public static void main(String[] args) {
			Car bmw=new Car();
			bmw.model="X6";
			bmw.make="BMW";// when you print just bmw. is shows the range of what you can put
			bmw.color="Black";
			bmw.year=2022;
			bmw.typeOfEngine="V8";
			bmw.HP=500;
			System.out.println(bmw.model);
			bmw.MoveForward();
			bmw.reverse();
			
			Car lexus=new Car();
			lexus.make="Lexus";
			lexus.model="LFA";
			lexus.color="White";
			lexus.MoveForward();
		
	}

}
