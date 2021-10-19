package com.shristi.basic;

import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
 		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int lengthOfArray = sc.nextInt();

		int[] numbers = new int[lengthOfArray];
		System.out.println("Enter Values");
		for (int i = 0; i < numbers.length; i++) {
			
			numbers[i] = sc.nextInt();

		}
		int b = 0;
		for (int j = 0; j < numbers.length; j++) {
			for (int k = j + 1; k < numbers.length; k++) {
				if (numbers[j] < numbers[k]) {
					b = numbers[j];
					numbers[j] = numbers[k];
					b = numbers[k];

				}

			}

		}
		System.out.println(numbers[1]);

	}

}
