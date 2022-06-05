package com.syntax.class11;

public class Phone {

	String model;
	String make;
	String color;
	String memorySize;
	String screenSize;
	String cameraResolution;
	
	void makeCalls() {
		System.out.println("Phone is used to make calls");
	}
	void takePhotos() {
		System.out.println(("Phone is used to take photos"));
	}
	public static void main(String[] args) {
		
		Phone iPhone=new Phone();
		iPhone.model="12ProMax";
		iPhone.make="iPhone";
		iPhone.color="Black";
		iPhone.memorySize="256";
		iPhone.screenSize="5.7";
		iPhone.cameraResolution="14.5 megapixel";
		
		iPhone.makeCalls();
		
		Phone Pixel=new Phone();
		Pixel.model="Pixel 6";
		Pixel.make="Google";
		Pixel.color="Pink";
		Pixel.memorySize="128gb";
		Pixel.screenSize="6.3";
		Pixel.cameraResolution="50 megapixel";
		
		Pixel.takePhotos();
		
		Phone Samsung=new Phone();
		Samsung.model="GalaxyS20+";
		Samsung.make="Samsung";
		Samsung.color="Grey";
		Samsung.memorySize="256gb";
		Samsung.screenSize="6.7";
		Samsung.cameraResolution="64 megapixel";
		
		Samsung.makeCalls();
		
	}
}
