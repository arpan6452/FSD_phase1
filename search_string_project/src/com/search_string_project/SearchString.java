package com.search_string_project;

import java.util.Arrays;
import java.util.Scanner;

public class SearchString {
	public static void main(String[] args) {
		String names[] = { "Java", "Phython", "Javascript", "Node", "Angular", "React" };
		System.out.println(Arrays.toString(names));
		System.out.println("Please enter a string and let's find out it is present in the above list or not: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		boolean isPresent = false;
		for(int loop=0;loop<names.length;loop++) {
			if(names[loop].equalsIgnoreCase(input)) {
				System.out.println("The input string is present: "+ input);
				isPresent = true;
				break;
			}
		}
		if(!isPresent)
			System.out.println("The input string is not present: "+ input);
	}
}
