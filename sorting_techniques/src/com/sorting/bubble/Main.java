package com.sorting.bubble;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int input[] = { 3, 7, 98, 45, 23, 19 };
		BubbleSort bubbleSort = new BubbleSort();
		System.out.println("The sorted array is " + Arrays.toString(bubbleSort.bubbleSort(input)));
	}
}
