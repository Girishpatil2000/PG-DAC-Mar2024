package com.assi4.classs;

import java.util.Scanner;

class Student{
	private String name;
	private int rollNo;
	private float marks;
	
	Scanner sc=new Scanner(System.in);
	
	public void addinfo()
	{
		System.out.print("Enter Student Name	 :	");
		this.name=sc.nextLine();
		

		System.out.print("Enter Student roll Number	:	");
		this.rollNo=sc.nextInt();
		

		System.out.print("Enter Student Marks :");
		this.marks=sc.nextFloat();
	}
	
	public void displayinfo()
	{
		System.out.printf("%-20s%-10d%-10.2f\n",this.name, this.rollNo, this.marks);
	}
	
	
	
	
}

public class Program {

	public static void main(String[] args) {
		Student stu=new Student();
		
		stu.addinfo();
		stu.displayinfo();

	}

}
