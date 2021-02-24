package com.thread_nonsync;

public class ThreadImplementationNonSync {
	public static void main(String[] args) {
		PrintNumberClass printNumberClass = new PrintNumberClass();
		ThreadClass1 thread1 = new ThreadClass1(printNumberClass);
		thread1.setName("ThreadNonSync1");
		ThreadClass1 thread2 = new ThreadClass1(printNumberClass);
		thread2.setName("ThreadNonSync2");		

		System.out.println(
				"Un-Synchronized threads run randomly");
		thread1.start();
		thread2.start();
		
	}
}
