package com.exception_handling;

import java.util.Scanner;

public class ExceptionHandlingMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your email id");
		String input = sc.next();
		EmailBussinessLogic emailBussinessLogic = new EmailBussinessLogic();
		try {
			if (emailBussinessLogic.isValidEmailId(input))
				System.out.println("This is a valid email id " + input);
		} catch (MyEmailIDException exception) {
			System.out.println(exception.getMessage());
		}finally {
			sc.close();
		}
	}
}
