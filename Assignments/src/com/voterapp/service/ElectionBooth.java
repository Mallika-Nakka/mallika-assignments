package com.voterapp.service;

import com.voterapp.exceptions.*;

public class ElectionBooth {
	String localities []= {"Hyderabad","Vijag","Guntoor"};
	
	public boolean checkAge(int age) throws UnderAgeException{
		
		if (age>=18) {
			System.out.println("You are Eligible to Vote");
			System.out.println("Enter your Locality");
		}
		else {
			throw new UnderAgeException("You are not Eligible to Vote because of Under age Exception");
		}
		return true;
	}
	public boolean checkLocality(String locality) throws LocalityNotFoundException{
		for (String city:localities) {
			if (city.equals(locality)) {
				System.out.println("You are Eligible to Vote");
				System.out.println("Enter your Voter Id");
				break;
			}
			else {
				throw new LocalityNotFoundException("Locality not found so You are not Eligible ");
			}
		}
		return true;
	}
	//check if voter id within 1000-9000
	public boolean checkVoterId(int vid) throws NoVoterIdException{
		if (1000<=vid && vid<=9000) {
			System.out.println("You are Eligible to Vote");
			System.out.println("Please Give your Valuable vote");
			
		}
		else {
			throw new NoVoterIdException("No Voter Id so you are not Eligible");
		}
	
		return true;
	}
	
	
	
	public boolean checkEligibility(int age,String locality,int vid) throws NotEligibleException{
		
		return true;
		
	}

	
}
