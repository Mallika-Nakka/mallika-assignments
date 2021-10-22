package com.oops.assignments;
import java.util.Scanner;
public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		double basicAllowance=20000;
		double carAllowance=10000;
		double homeAllowance=20000;
		System.out.println("Enter designation");
		String designation=sc.next();
		
		Employee programmer=new Employee(name,designation);
		Employee manager=new Employee(name,designation);
		Employee director=new Employee(name,designation);
		
		
		if (designation.equals("Manager")) {
			double bonus=manager.calcBonus(basicAllowance, carAllowance);
			System.out.println((int) bonus);
		}
		else if (designation.equals("Programmer")) {
			double bonus=programmer.calcBonus(basicAllowance);
			System.out.println((int) bonus);
		}
		else if (designation.equals("Director")) {
			double bonus=director.calcBonus(basicAllowance, carAllowance,homeAllowance);
			System.out.println((int) bonus);
		}
		
		
		
		

	}

}
