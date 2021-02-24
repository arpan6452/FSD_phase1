package com.resolveMultipleInheritance;

public class ChildClass implements Parent1, Parent2 {

	@Override
	public void parent2Method1() {
		System.out.println("This method1 is from parent1");
	}

	@Override
	public void parent2Method2() {
		System.out.println("This method2 is from parent2");
	}

	@Override
	public void parent2Method3() {
		System.out.println("This method3 is from parent2");
	}

	@Override
	public void parent1Method1() {
		System.out.println("This method1 is from parent2");
	}

	@Override
	public void parent1Method2() {
		System.out.println("This method2 is from parent1");
	}

	@Override
	public void parent1Method3() {
		System.out.println("This method3 is from parent1");

	}

	@Override
	public void commonMethod() {
		System.out.println("This is a common method");

	}

}
