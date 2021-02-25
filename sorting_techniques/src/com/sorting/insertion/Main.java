package com.sorting.insertion;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int input[] = { 3, 7, 98, 45, 23, 19 };
		InsertionSort insertionSort = new InsertionSort();
		System.out.println("The sorted array is " + Arrays.toString(insertionSort.insertionSort(input)));
	}
}
