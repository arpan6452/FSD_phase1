package com.oops.concepts;

public class MainClass {
	public static void main(String[] args) {
		ClassGrandParent grandParent = new ClassGrandParent();
		ClassGrandParent parent = new ClassParent();
		ClassGrandParent childClass = new ClassChild();
		grandParent.printAge();
		parent.printAge();
		childClass.printAge();
		
		grandParent.printHierarchicalLevel();
		parent.printHierarchicalLevel();
		childClass.printHierarchicalLevel();
	}
}
