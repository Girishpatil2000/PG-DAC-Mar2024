package com.assi4.classs;


class Static_over{
	private String name;
	private String color;
	private int YOP ;
	private float price;
	


	public void displayinfo(String name) {
		System.out.println(name);

	}
	public void displayinfo(String name,String color) {
		System.out.println(color);

	}
	public void displayinfo(String name,String color,int YOP) {
		System.out.println(YOP);

	}
	
}


public class Over {
	public static void main(String[] args) {
		Static_over so=new Static_over();
		so.displayinfo("Thar");
		so.displayinfo("Thar","Black");
		so.displayinfo("Thar","White",2023);
		

	}

}





