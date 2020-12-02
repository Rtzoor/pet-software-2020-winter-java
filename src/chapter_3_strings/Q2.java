package chapter_3_strings;

import java.util.Scanner;

public class Q2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter students num: ");
		int students_num = 0;
		String students = "** ";
		do
			students_num = sc.nextInt();
		while (students_num < 1);
		for (int i = 0; i < students_num; i++) {
			System.out.println("Enter student name: ");
			students += sc.next();
			students += " - ";
			System.out.println("Enter student class: ");
			students += sc.next();
			students += " ** ";
		}
		System.out.println(students);
	}

}
