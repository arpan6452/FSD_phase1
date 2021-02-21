package com.arrayProject;

public class MultiDimentionalArray {
	public int[][] createMultiDimentionalArray(int row, int column) {
		int arr[][] = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = i+j;
			}
		}
		return arr;
	}
}
