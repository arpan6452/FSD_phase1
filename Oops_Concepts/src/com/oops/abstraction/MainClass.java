package com.oops.abstraction;

import java.util.Date;

public class MainClass {
	public static void main(String[] args) {
		Bank bank = new Bank("SBI1234", "SBI", "Kolkata", new Date(1996, 06, 21));
		System.out.println("Hiding the registration date to customer since it is irrelivant for them");
		System.out.println(bank);
		
	}
}
