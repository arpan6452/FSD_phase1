package com.innerClass;

public class StaticInnerClassExpl {
	static String name = "Arpan";
	static class InnerClass{
		void printMsg() {
			System.out.println("Static inner class can only access static member : " + StaticInnerClassExpl.name);	
		}		
	}
}
