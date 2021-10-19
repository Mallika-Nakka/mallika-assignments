package com.shristi.basic;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first NUmber");
		int firstNumber=sc.nextInt();
		System.out.println("Enter second NUmber");
		int secondNumber=sc.nextInt();
		
		
		
		
		for (int i=firstNumber;i<=secondNumber;i++) {
			
			if (i%2==0) {
				System.out.println(i);
				
			}
			
		}

	}

}
