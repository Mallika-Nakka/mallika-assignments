package com.basics.assignments;

import java.util.Scanner;

public class SquareOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Value");
		//System.out.println("0".repeat(4));
		Scanner sc = new Scanner(System.in);
		int lengthOfArray = sc.nextInt();
		
		int[] normalArray1=new int[lengthOfArray];
		System.out.println("Enter Values");
		for (int i=0;i<lengthOfArray;i++) {
			normalArray1[i]=sc.nextInt();
			
		}
		
		for (int num:normalArray1) {
			System.out.print(Math.sqrt(num));
		}
		
		

	}

}
