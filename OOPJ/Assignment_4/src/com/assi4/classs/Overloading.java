package com.assi4.classs;

import java.util.Scanner;

class Car{
	
	public static void displayinfo(String name, String color, int YOP) {
		System.out.println(name+" "+color+" "+YOP);
	}

	public static void displayinfo(String name, String color, int YOP, Float price) {
		System.out.printf(name + " " + color + " " + YOP + " " + price+"\n");

	}
	public static void displayinfo(String name) {
		System.out.printf(name+"\n" );

	}
	public static void displayinfo(String name, String color) {
		System.out.printf(name + " " + color+"\n" );

	}
	public static void displayinfo(String name, String color,Float price) {
		System.out.printf(name + " " + color+" "+price );

	}
}

public class Overloading {

	public static void main(String[] args) {

		
		Car.displayinfo("Thar","Black",2022);
		Car.displayinfo("Fortuner", "white", 2023,3500000.5f);
		Car.displayinfo("Fortuner");
		Car.displayinfo("FortunerFo","Black");
		Car.displayinfo("FortunerFo","Black",4500000);
		

	}
}


