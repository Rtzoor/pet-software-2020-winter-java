package chapter_2_counter_arrays;

import java.util.Scanner;

public class Q4 {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] chars_count_arr = new int[26];
		while (true) {
			System.out.print("Enter character (a-z): ");
			char user_input = sc.next().charAt(0);
			if (user_input == '.')
				break;
			if (user_input >= 'a' && user_input <= 'z')
				chars_count_arr[user_input-'a']++;
			else
				System.out.println("char out of range");
		}
		
		for (int i = 0; i < chars_count_arr.length; i++)
			System.out.println(
					(char)(i + 'a') + " is " + chars_count_arr[i]);
	}

}
