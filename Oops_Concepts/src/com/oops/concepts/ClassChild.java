package com.oops.concepts;

public class ClassChild extends ClassParent {
	
	public ClassChild() {
		
	}

	// can not be inherited
	private int age = 20;

	// will be inherited
	@Override
	void printGroup() {
		System.out.println("I am a child");
	}

	// will be inherited
	@Override
	protected void printHierarchicalLevel() {
		System.out.println("Parent Hierarchical level is 3");
	}

	// will be inherited
	@Override
	public void printAge() {
		System.out.println("Child age is " + age);
	}
}
