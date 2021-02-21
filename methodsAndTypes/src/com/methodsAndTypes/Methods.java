package com.methodsAndTypes;

public class Methods extends ParentMethods{
	
	public void overwriddenMethodEx() {
		System.out.println("This is from Child Class");
	}

	public static void staticVoidMethod() {
		System.out.println("This is static method.Called by the class.");
	}
	
	public void nonStaticMethod() {
		System.out.println("This is non-static method.Called by the object.");
	}
	
	public int overloadedMethod(int a, int b) {
		return a+b;
	}
	
	public float overloadedMethod(float a, float b) {
		return a+b;
	}
	
	public boolean isEvenNumber(int num) {	
		if(num%2 == 0) {
			return true;
		}else {
			return false;
		}		
	}
	
	public String getUserName(String emailID) {
		return emailID.split("@")[0];
	}			
	
}
