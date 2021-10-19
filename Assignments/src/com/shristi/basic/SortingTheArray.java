package com.shristi.basic;

import java.util.Scanner;
import java.util.Arrays;


public class SortingTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int lengthOfArray=sc.nextInt();
        
		int[] numbers = new int[lengthOfArray];

		System.out.println("Enter Values");

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = sc.nextInt();
		}
		
		Arrays.sort(numbers);
		
		for (int number:numbers) {
			System.out.print(number+" ");
		}
		

	}

}
