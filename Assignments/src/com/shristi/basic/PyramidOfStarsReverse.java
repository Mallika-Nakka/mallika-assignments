package com.shristi.basic;

import java.util.Scanner;

public class PyramidOfStarsReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Value");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			String pattern = "";
			String spaces = "";
			for (int j=0;j<i;j++) {
				spaces=spaces+" ";
			}

			int k = number - i;

			for (int l = 0; l < k + 1; l++) {
				// spaces=spaces+" ";
				pattern = pattern + "* ";

			}

			System.out.println(spaces + pattern);

		}

	}

}
