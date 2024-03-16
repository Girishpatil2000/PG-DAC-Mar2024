package com.assi4.classs;



import java.util.Scanner;

class Employee{
	
	private String name;
	private int EmpId;
	private float Salary ;
	private String position;
	private double saving;
	
	

	
	
	
	public static void displayinfo(String name, int EmpId, float Salary) {
		
		System.out.printf("%-10s%-10d%-10f\n", name, EmpId, Salary);
	}



	public static void displayinfo(String name, int EmpId, float Salary, String position) {
		System.out.printf("%-10s%-10d%-10.2f%-10s\n", name, EmpId, Salary, position);

	}
	public static void displayinfo(String name, int EmpId, float Salary, String position,double saving) {
		System.out.printf("%-10s%-10d%-10.2f%-20s%-10f\n", name, EmpId, Salary, position,saving);

	}

}

public class Program3 {

	public static void main(String[] args) {

		
		Employee.displayinfo("Girish",38,45000);
		Employee.displayinfo("deepak",31,60000,"Developer");
		Employee.displayinfo("Gajanan",34,50000,"senior Developer",50000000);
		

	}
}


