package com.pack2;

import com.pack1.MainClass;

public class DifferentClassProtectedTestClass extends MainClass {
	public static void main(String[] args) {
		DifferentClassProtectedTestClass cp = new DifferentClassProtectedTestClass();
		cp.protectedField = 234;
		System.out.println("protected is accessable = " + cp.protectedField);
		cp.publicField = 1234;
		System.out.println("public is accesable = " + cp.publicField);
	}
}
