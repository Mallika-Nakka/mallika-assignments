package com.shristi.basic;

import java.util.Scanner;

public class FactorialForANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");

		int number = sc.nextInt();

		int factorialOfNumber = 1;
		
		for (int i = 1; i <= number; i++) {
			factorialOfNumber = factorialOfNumber * i;

		}

		System.out.println(factorialOfNumber);

	}

}
