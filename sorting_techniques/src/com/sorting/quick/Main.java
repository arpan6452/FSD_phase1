package com.sorting.quick;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {		
		int[] arr = { 90, 23, 101, 45, 65, 23, 67, 89, 34, 23 };
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(arr, 0, 9);
		System.out.println("\n The sorted array is: \n");		
		System.out.println(Arrays.toString(arr));
	}
}
