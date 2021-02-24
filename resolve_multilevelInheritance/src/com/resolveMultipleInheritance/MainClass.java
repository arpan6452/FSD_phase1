package com.resolveMultipleInheritance;

public class MainClass {
	public static void main(String[] args) {
		Parent1 parent1 = new ChildClass();
		Parent2 parent2 = new ChildClass();
		
		parent1.parent1Method1();
		parent1.parent1Method2();
		parent1.parent1Method3();
		
		parent2.parent2Method1();
		parent2.parent2Method2();
		parent2.parent2Method3();
		
		parent1.commonMethod();
		parent2.commonMethod();
	}
}
