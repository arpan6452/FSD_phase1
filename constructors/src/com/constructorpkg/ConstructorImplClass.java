package com.constructorpkg;

public class ConstructorImplClass {
	private String param1;
	private String param2;
	
	// this is an default constructor
	public ConstructorImplClass() {
		
	}
	
	// this is an parameterized constructor
	public ConstructorImplClass(String param1,String param2) {
		this.param1 = param1;
		this.param2 = param2;
	}
	
	public void printMessage() {
		System.out.println("Hi I am being called from an object of this class");
	}
	
	public void printParams() {
		System.out.println("The params are : "+ param1 + " and " + param2);
	}
}
