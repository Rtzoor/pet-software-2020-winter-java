package chapter_2_counter_arrays;

import java.util.Random;

public class Q5 {
	final static int MAX = 95;
	final static int MIN = 25;
	

	public static void main(String[] args) {
		Random rnd = new Random();
		// +1 because range is inclusive
		// countArr holds the occurrences of each random number
		// the indexes represent the random numbers 
		int[] countArr = new int[MAX-MIN+1];
		
		// with each iteration we make a random number and
		// increment the value held in the that index
		for (int i = 0; i < 100; i++)
			countArr[rnd.nextInt(MAX-MIN+1)]++;

		// to see which number occurred the most we check
		// in each iteration if the occurrence in index i
		// is greater than the occurrence in index maxNum
		// and we assume that maxNum index is zero
		int maxNum = 0;
		for (int i = 0; i < countArr.length; i++)
			if (countArr[maxNum] < countArr[i])
				maxNum = i;
		
		System.out.println();
		System.out.println("Max num is: " + (maxNum+MIN));
	}

}
