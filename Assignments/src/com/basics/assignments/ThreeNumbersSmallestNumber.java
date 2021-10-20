package com.basics.assignments;

import java.util.Scanner;

public class ThreeNumbersSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 3 values");
		Scanner sc=new Scanner(System.in);
		int firstNumber=sc.nextInt();
		int secondNumber=sc.nextInt();
		int thirdNumber=sc.nextInt();
		
		if (firstNumber<secondNumber&&firstNumber<thirdNumber ) {
			System.out.println(firstNumber);
		}
		
		else if (firstNumber>secondNumber&&thirdNumber>secondNumber ) {
			System.out.println(secondNumber);
		}
		else {
			System.out.println(thirdNumber);
		}
		
		
		

	}

}
