package com.basics.assignments;
import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter name to register");
		String[] userNames=new String[] {"tejesh","sreekanth","ramya","jon"};
		Scanner sc=new Scanner(System.in);
		String userName=sc.next();
		
		
		
		String duplicateName="";
		
		for (String name:userNames) {
			if (name.equals(userName)) {
				//System.out.println("Hii");
				duplicateName+=userName;
			}
		}
		
		if (duplicateName.equals(userName)) {
			System.out.println(" You are logged in successfully");
		}
		else {
			System.out.println("Invalid username");
		}
		
		
		
	
		
	}

}
