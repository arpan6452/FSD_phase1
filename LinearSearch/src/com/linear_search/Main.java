package com.linear_search;

public class Main {
	public static void main(String[] args) {
		LinearSearch linearSearch = new LinearSearch();
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int res = linearSearch.linearSearch(arr, 8);
		if(res== -1)
			System.out.println("Element not found");
		else 
			System.out.println("Element found in the position : " + res);
	}
}
