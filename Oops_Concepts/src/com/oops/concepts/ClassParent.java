package com.oops.concepts;

public class ClassParent extends ClassGrandParent {
	
	public ClassParent() {
		
	}

	//wrapping data with method is encapsulation
	// can not be inherited
	private int age = 40;

	// will be inherited
	@Override
	void printGroup() {
		System.out.println("I am a parent");
	}

	// will be inherited
	@Override
	protected void printHierarchicalLevel() {
		System.out.println("Parent Hierarchical level is 2");
	}

	// will be inherited
	@Override
	public void printAge() {
		System.out.println("Parent age is " + age);
	}
}
