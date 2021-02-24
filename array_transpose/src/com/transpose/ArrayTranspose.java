package com.transpose;

import java.util.Arrays;

public class ArrayTranspose {
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int value = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = value;
				value++;
			}
		}
		System.out.println(Arrays.deepToString(arr));

		int transpose[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				transpose[i][j] = arr[j][i];
			}
		}
		
		System.out.println("Transpose: " + Arrays.deepToString(transpose));
	}
}
