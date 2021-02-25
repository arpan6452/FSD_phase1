package com.sorting.selection;

public class SelectionSort {
	public int[] selectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length - i; j++) {
				if (arr[index] > arr[j]) {
					index = j;
				}
			}
			int smallestNo = arr[i];
			arr[i] = arr[index];
			arr[index] = smallestNo;

		}
		return arr;

	}
}
