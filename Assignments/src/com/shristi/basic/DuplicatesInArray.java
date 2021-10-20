package com.shristi.basic;

import java.util.Scanner;

public class DuplicatesInArray {

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
		
		int[] newArray = new int[numbers.length];
		int visited = -1;
		for (int i = 0; i < numbers.length; i++) {
			int count = 1;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					count++;
					// To avoid counting same element again
					newArray[j] = visited;
				}
				
			}
			if (newArray[i] != visited)
				newArray[i] = count;
		}

		int count1=0;
		
		// Displays the frequency of each element present in array
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] != visited && newArray[i]>1)
				count1+=newArray[i]-1;
				//System.out.println(numbers[i] + " is repeated " + newArray[i] + " times in the given array");
		}
		
		System.out.println(count1);
		

		/*
		 * int count1 = 0;
		 * 
		 * for (int num : numbers) { int count = 0; for (int j = 0; j < lengthOfArray;
		 * j++) { if (num == numbers[j]) { count += 1; } }
		 * 
		 * System.out.println(count);
		 * 
		 * if (count > 1) { count1 += (count - 1); }
		 * 
		 * }
		 * 
		 * System.out.println(count1);
		 */

		sc.close();

	}

}
