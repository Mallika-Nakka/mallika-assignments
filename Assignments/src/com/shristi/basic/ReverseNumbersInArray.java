package com.shristi.basic;

import java.util.Scanner;

public class ReverseNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Hello");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int lengthOfArray=sc.nextInt();
        
		int[] numbers = new int[lengthOfArray];

		System.out.println("Enter Values");

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = sc.nextInt();
		}
		
		for (int j = 1; j < numbers.length+1; j++) {
			int k=lengthOfArray-j;
			System.out.print(numbers[k]+" ");

			
		}

		

	}

}
