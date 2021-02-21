package com.pack1;

public class SamePackageTestClass {
	public static void main(String[] args) {
		MainClass c = new MainClass();
		c.setPrivate(20);
		c.printPrivateField();
		c.protectedField = 100;
		System.out.print("protected Field = "+ c.protectedField);
		c.defaultField = 99;
		System.out.println("Default Field = "+ c.defaultField);
		c.publicField = 898989;
		System.out.println("Public Field = "+ c.publicField);
	}
}
