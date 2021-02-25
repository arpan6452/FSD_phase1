package com.lis;

public class LIS {

	static int refference;
	static int lis_Calculation(int arr[], int n) {

		if (n == 1)
			return 1;

		int res, maxLast = 1;

		for (int i = 1; i < n; i++) {
			res = lis_Calculation(arr, i);
			if (arr[i - 1] < arr[n - 1] && res + 1 > maxLast)
				maxLast = res + 1;
		}

		if (refference < maxLast)
			refference = maxLast;

		return maxLast;
	}
	
	static int lis(int arr[], int n) {		
		refference = 1;
		
		lis_Calculation(arr, n);
		
		return refference;
	}

	public static void main(String args[]) {
		int arr[] = { 5, 8, 9, 1, 21, 64, 22, 41 };
		int n = arr.length;
		System.out.println("Length of lis is " + lis(arr, n));
	}
}
