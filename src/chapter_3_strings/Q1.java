package chapter_3_strings;

import java.util.Scanner;

public class Q1 {
	final static int NUM_OF_STRINGS = 4;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		immediate_output();
//		delayed_output();
	}
	
	public static void immediate_output() {
		String line = "";
		for (int i = 0; i < NUM_OF_STRINGS; i++) {
			System.out.println("Enter a string (" + (i+1) + "/" + NUM_OF_STRINGS + "):");
			line = sc.nextLine();
			if (line.length() % 2 == 0)
				System.out.println(line);
		}
	}
	
	// waits until user is finished
	public static void delayed_output() {
		String[] str_arr = new String[NUM_OF_STRINGS];
		for (int i = 0; i < NUM_OF_STRINGS; i++) {
			System.out.println("Enter a string (" + (i+1) + "/" + NUM_OF_STRINGS + "):");
			str_arr[i] = sc.nextLine();
		}
		System.out.println("strings with even length:");
		for (int i = 0; i < NUM_OF_STRINGS; i++) {
			if (str_arr[i].length() % 2 == 0)
				System.out.println(str_arr[i]);
		}
	}

}
