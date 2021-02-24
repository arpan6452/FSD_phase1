package com.runnable_example;

public class RunnableImplementation {
	public static void main(String[] args) {
		RunnableInterfaceImpl runnable1 = new RunnableInterfaceImpl();
		RunnableInterfaceImpl runnable2 = new RunnableInterfaceImpl();
		RunnableInterfaceImpl runnable3 = new RunnableInterfaceImpl();
		RunnableInterfaceImpl runnable4 = new RunnableInterfaceImpl();
		
		Thread thread1 = new Thread(runnable1,"Thread1");
		Thread thread2 = new Thread(runnable2,"Thread2");
		Thread thread3 = new Thread(runnable3,"Thread3");
		Thread thread4 = new Thread(runnable4,"Thread4");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
