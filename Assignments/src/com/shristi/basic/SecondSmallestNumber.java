package com.shristi.basic;

import java.util.Scanner;

public class SecondSmallestNumber {

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

		int b=0;
		//[10 20 5 4 1 ]
		for (int i=0;i<numbers.length;i++) {
			for (int j=i+1;j<numbers.length;j++) {
				if (numbers[i]>numbers[j]) {
					b=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=b;
				}
				
			}
		}
		
		System.out.println(numbers[1]);
		

	}

}
