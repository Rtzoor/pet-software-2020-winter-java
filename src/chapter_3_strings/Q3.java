package chapter_3_strings;

import java.util.Scanner;

public class Q3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter string to look in: ");
		String st = sc.next();
		System.out.print("Enter char to look for: ");
		char ch = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < st.length(); i++)
			if (st.substring(i).charAt(0) == ch)
				count++;
		System.out.println(
				ch + " appears " + count + " times in the string \"" + st + "\"");
	}

}
