package com.shristi.basic;

import java.util.Scanner; 

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Value");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		
		int factors=0;
		
		for (int i=2;i<number;i++) {
			if (number%2==0) {
				factors+=1;
			}
			
			
		}
		
		if (factors==0) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}
		
		

	}

}
