package com.constructorpkg;

public class ContructorMainClass {
	public static void main(String[] args) {
		ConstructorImplClass constructorImplClass1 = new ConstructorImplClass();
		constructorImplClass1.printMessage();
		ConstructorImplClass constructorImplClass2 = new ConstructorImplClass("Text1", "Text2");
		constructorImplClass2.printMessage();
		constructorImplClass2.printParams();
		
		System.out.println("Here every time new object is created.");
		System.out.println("Created objects are " + constructorImplClass1 + " and " + constructorImplClass2);
		
		SingletonContructor singletonContructor1 = SingletonContructor.getInstance();		
		SingletonContructor singletonContructor2 = SingletonContructor.getInstance();
		System.out.println("Here only new object is created.");
		System.out.println("Created object is same. " + singletonContructor1 + " and " + singletonContructor2);
		
	}

}
