package com.try_catch_example;

public class TryCatch {
	public static void main(String[] args) {		
		int arr[] = new int[5];
		try {
			for (int i = 0; i < 6; i++) {
				arr[i] = i;
				arr[i] = i/0;
				
			}			
		} catch (ArrayIndexOutOfBoundsException aiob) {
			System.out.println(aiob);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} 

	}
}
