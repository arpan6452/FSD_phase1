package com.oops.concepts;

public class ClassGrandParent {

	public ClassGrandParent() {

	}

	// can not be inherited
	private int age = 80;

	// will be inherited
	void printGroup() {
		System.out.println("I am a grand parent");
	}

	// will be inherited
	protected void printHierarchicalLevel() {
		System.out.println("GrandParent Hierarchical level is 1");
	}

	// will be inherited
	public void printAge() {
		System.out.println("Grand Parent age is " + age);
	}

}
