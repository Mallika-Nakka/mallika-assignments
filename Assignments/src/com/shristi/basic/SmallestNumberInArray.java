package com.shristi.basic;

import java.util.Scanner;

public class SmallestNumberInArray {

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

		int assumedGreatestNumber = numbers[0];

		for (int number : numbers) {
			if (assumedGreatestNumber > number) {
				assumedGreatestNumber = number;
			}
		}
		System.out.println(assumedGreatestNumber);

	}

}
