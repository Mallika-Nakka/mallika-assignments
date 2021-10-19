package com.shristi.basic;

import java.util.Scanner; 

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length");
		int lengthOfArray=sc.nextInt();
		
		int[] numbers=new int[lengthOfArray];
		
		int sum=0;
		System.out.println("Enter Values");
		for (int i=0;i<lengthOfArray;i++) {
			sum+=sc.nextInt();
		}
		
		System.out.println("Sum of Array: "+sum);
		System.out.println("Average of Array: "+ (long) (sum/lengthOfArray));
		

	}

}
