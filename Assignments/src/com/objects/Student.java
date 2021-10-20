package com.objects;

import java.util.Scanner;

public class Student {
	String name, studentId;

	Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;

	}

	void getDetails() {
		System.out.println("Nam:e " + name);
		System.out.println("Student Id: " + studentId);
	}

	Scanner sc = new Scanner(System.in);

	void getGrades(int[] marks) {
		int sum = 0; 

		for (int singleMarks : marks) {
			sum += singleMarks;

		}

		int average = sum / marks.length;

		System.out.println("Sum of marks: "+sum);
		System.out.println( "Average of marks"+average);

		if (average >= 75) {
			System.out.println("A");
		} else if (average > 50 && average < 75) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}

	}

}
