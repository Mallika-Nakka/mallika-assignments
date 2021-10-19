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
		int[] fr = new int[numbers.length];
		int visited = -1;
		for (int i = 0; i < numbers.length; i++) {
			int count = 1;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					count++;
					// To avoid counting same element again
					fr[j] = visited;
				}
			}
			if (fr[i] != visited)
				fr[i] = count;
		}

		// Displays the frequency of each element present in array
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited && fr[i]>1)
				System.out.println(numbers[i] + " is repeated " + fr[i] + " times in the given array");
		}

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
