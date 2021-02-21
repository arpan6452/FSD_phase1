package com.pack1;

public class MainClass {
	private int privateField;
	protected int protectedField;
	int defaultField;
	public int publicField;
	
	public void printPrivateField() {
		System.out.print("x=" + privateField);
	}
	
	public void setPrivate(int privateField) {
		this.privateField = privateField;
	}

}
