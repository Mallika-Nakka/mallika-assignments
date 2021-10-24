package com.voterapp.main;
import java.util.Scanner;

import com.voterapp.exceptions.LocalityNotFoundException;
import com.voterapp.exceptions.NoVoterIdException;
import com.voterapp.exceptions.UnderAgeException;
import com.voterapp.service.ElectionBooth;
import com.voterapp.service.NotEligibleException;
public class Voter {
	
	public static void main(String[] args) throws NotEligibleException{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		ElectionBooth booth =new ElectionBooth();
		
		try {
			booth.checkAge(age);
			String locality=sc.next();
			try {
				booth.checkLocality(locality);
				int vid=sc.nextInt();
				try {
					booth.checkVoterId(vid);
				}catch(NoVoterIdException e) {
					System.out.println(e.getMessage());
					System.out.println("Good Bye");
				}
			}catch(LocalityNotFoundException e) {
				System.out.println(e.getMessage());
				System.out.println("Good Bye");
			}
			
			
			
		}catch(UnderAgeException e) {
			System.out.println(e.getMessage());
			System.out.println("Good Bye");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Close db");
		
		
		//booth.checkEligibility(age,locality,vid);
		
	}
	
	
	

}
