package com.sorting.bubble;

public class BubbleSort {
	public int[] bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - i; j++) {
				if (arr[i] > arr[j]) {
					int swap = arr[i];
					arr[i] = arr[j];
					arr[j] = swap;
				}
			}
		}
		return arr;

	}
}
