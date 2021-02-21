package com.methodsAndTypes;

public class MethodsMain {
	public static void main(String[] args) {
		ParentMethods parentMethods = new ParentMethods();
		parentMethods.overwriddenMethodEx();
		Methods methods = new Methods();
		methods.overwriddenMethodEx();
		
		Methods.staticVoidMethod();
		methods.nonStaticMethod();
		
		int intRes = methods.overloadedMethod(4, 6);
		float floatRes = methods.overloadedMethod(6, 9);
		System.out.println(intRes);
		System.out.println(floatRes);
		
		if(methods.isEvenNumber(5))
			System.out.println("This is an even number");
		else
			System.out.println("This is an odd number");
		String username = methods.getUserName("arpan@gmail.com");
		System.out.println("The username is :" + username);
		
	}
}
