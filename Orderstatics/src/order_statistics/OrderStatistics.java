package order_statistics;

import java.util.Arrays;

public class OrderStatistics {
	public static int kthSmallest(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k - 1];
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 12, 3, 5, 7, 19 };
		int k = 4;
		System.out.print("OrderStatistics of " + k + " is " + kthSmallest(arr, k));
	}

}
