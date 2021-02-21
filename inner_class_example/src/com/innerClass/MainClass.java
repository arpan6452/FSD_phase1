package com.innerClass;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Static Inner Class");
		StaticInnerClassExpl.InnerClass staticInnerClassExpl = new StaticInnerClassExpl.InnerClass();
		staticInnerClassExpl.printMsg();
		
		System.out.println("Outer Class");		
		InnerClassExpl innerClassExpl = new InnerClassExpl();	
		innerClassExpl.printDetails();
		InnerClassExpl.InnerClass innerClass = innerClassExpl.new InnerClass();
		innerClass.printMsg();
	}
}
