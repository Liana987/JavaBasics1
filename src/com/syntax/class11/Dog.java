package com.syntax.class11;

public class Dog {
	//attributes how the object will look like
	String name; 
	int age;
	double weight;
	String color;
	double height;
	String breed;
	String amountOfShedding;
	
	//how that object behave
	void play() {
		System.out.println("Dogs like to play.");
	}
	void run() {
		System.out.println("Dogs love to run");
	}
	void sleep() {
		System.out.println("Dogs love to sleep");}
		
	public static void main(String[] args) {
			
		Dog Husky=new Dog();
		Husky.name="Ben";
		Husky.age=3;
		Husky.weight=6.5;
		Husky.color="white and black";
		Husky.height=21;
		Husky.breed="Siberian Husky";
		Husky.amountOfShedding="low";
		Husky.run();
		
		Dog Bulldog=new Dog();
		Bulldog.name="Angel";
		Bulldog.age=4;
		Bulldog.weight=14;
		Bulldog.color="white";
		Bulldog.height=30;
		Bulldog.breed="Bulldog";
		Bulldog.amountOfShedding="low";
		Bulldog.play();
		
		Dog Labrador  =new Dog();
		Labrador.name="Zuca";
		Labrador.age=7;
		Labrador.weight=10;
		Labrador.color="yellow";
		Labrador.height=25;
		Labrador.breed="Labrador";
		Labrador.amountOfShedding="medium";
		Labrador.sleep();
		
	}
	
	
	
}

