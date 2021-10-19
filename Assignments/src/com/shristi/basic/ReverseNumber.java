package com.shristi.basic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		String stringNumber = sc.next();

		String reverseNumber="";
		char[] charArray = stringNumber.toCharArray();

		int lengthOfNumber= (charArray.length);
		
		for (int i=1;i<lengthOfNumber+1;i++) {
			int j=lengthOfNumber-i;
			reverseNumber=reverseNumber+charArray[j];
		}
		
		System.out.println(reverseNumber);
		
		
		
	}

}
