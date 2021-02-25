package com.sorting.selection;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int input[] = { 3, 7, 98, 45, 23, 19 };
		SelectionSort selectionSort = new SelectionSort();
		System.out.println("The sorted array is " + Arrays.toString(selectionSort.selectionSort(input)));
	}
}
