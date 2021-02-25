package com.binarySearch;

public class BinarySearch {

	public int binarySearch(int arr[], int ele, int start, int end) {
		if (end >= start) {
			int mid = start + (end - start) / 2;
			if (ele == arr[mid])
				return mid;
			else if (ele < arr[mid])
				return binarySearch(arr, ele, start, mid - 1);
			else
				return binarySearch(arr, ele, mid + 1, end);
		}
		return -1;
	}
}
