package com.binarySearch;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int arr[] = { 2, 3, 4, 40, 10 };
		Arrays.sort(arr);
		int res = binarySearch.binarySearch(arr, 10, 0, arr.length - 1);
		if (res == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found in the position : " + res);
	}
}
