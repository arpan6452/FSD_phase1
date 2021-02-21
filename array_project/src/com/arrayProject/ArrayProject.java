package com.arrayProject;

import java.util.Arrays;

public class ArrayProject {
	public static void main(String[] args) {
		SingleDimentionalArray singleDimentionalArray = new SingleDimentionalArray();
		System.out.println("Single Dimentional Array: ");
		System.out.println(Arrays.toString(singleDimentionalArray.createSingleDimentionalArray(5)));
		MultiDimentionalArray multiDimentionalArray = new MultiDimentionalArray();
		System.out.println("Multi Dimentional Array: ");
		System.out.println(Arrays.deepToString(multiDimentionalArray.createMultiDimentionalArray(4, 4)));
	}
}
