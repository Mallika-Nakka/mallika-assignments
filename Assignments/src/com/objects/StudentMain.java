package com.objects;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter First Student name and Id");
		Scanner sc = new Scanner(System.in);
		String studentName1 = sc.next();
		String studentId1 = sc.next();
		System.out.println("Enter student subjects count");
		int countSubjects = sc.nextInt();
		int[] marks1 = new int[countSubjects];
		
        System.out.println("Enter student Marks");
		for (int i = 0; i < countSubjects; i++) {
			marks1[i] = sc.nextInt();
		}
		
		

		System.out.println("Enter Second Student Name and Id");
		String studentName2 = sc.next();
		String studentId2 = sc.next();
		System.out.println("Enter student subjects count");
		int countSubjects2 = sc.nextInt();
		int[] marks2 = new int[countSubjects];
		
        System.out.println("Enter student Marks");
		for (int i = 0; i < countSubjects2; i++) {
			marks2[i] = sc.nextInt();
		}

		Student student1 = new Student(studentName1, studentId1);
		student1.getDetails();
		student1.getGrades(marks1);
		
		Student student2 = new Student(studentName2, studentId2);
		student1.getDetails();
		student1.getGrades(marks2);
		

	}

}
