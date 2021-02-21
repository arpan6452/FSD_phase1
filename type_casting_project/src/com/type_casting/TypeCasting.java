package com.type_casting;

import java.util.Scanner;

public class TypeCasting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the uer input");
		String input = sc.next();
		sc.close();
		System.out.println(input);
		int strToInteger = Integer.parseInt(input);
		System.out.println("Printing integer of the string input "+ strToInteger);
		float strToFloat = Float.parseFloat(input);
		System.out.println("Printing float of the string input "+ strToFloat);
		double strToDouble  = Double.parseDouble(input);
		System.out.println("Printing double of the string input "+ strToDouble);
		long strToLong = Long.parseLong(input);
		System.out.println("Printing long of the string input "+ strToLong);
		byte strToByte = Byte.parseByte(input);
		System.out.println("Printing byte of the string input "+ strToByte);
		short strToShort = Short.parseShort(input);
		System.out.println("Printing short of the string input "+ strToShort);
		
		for(int index= 0;index<input.length(); index++) {
			System.out.println("Charector in pos "+index+" is " + input.charAt(index));
		}
		
	}
}
