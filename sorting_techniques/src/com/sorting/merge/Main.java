package com.sorting.merge;

import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		int arr[] = { 90, 23, 101, 45, 65, 23, 67, 89, 34, 23 };
		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		System.out.println(Arrays.toString(arr));
	}
}
