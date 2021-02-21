package com.arrayProject;

public class SingleDimentionalArray {
	public int[] createSingleDimentionalArray(int count) {
		int arr[] = new int[count];
		for(int i=0;i<count;i++) {
			arr[i] = i;
		}
		return arr;
	}
}
