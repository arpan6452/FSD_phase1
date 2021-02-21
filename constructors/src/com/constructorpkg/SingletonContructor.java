package com.constructorpkg;

public class SingletonContructor {
	static private SingletonContructor singletonContructor = null;
	
	private SingletonContructor() {
		
	}
	
	public static SingletonContructor getInstance() {
		if(singletonContructor == null) {
			singletonContructor = new SingletonContructor();			
		}
		return singletonContructor;
	}
}
