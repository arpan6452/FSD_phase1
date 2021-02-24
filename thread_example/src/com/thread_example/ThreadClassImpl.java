package com.thread_example;

public class ThreadClassImpl extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread Name "+Thread.currentThread().getName()+" and its id "+ Thread.currentThread().getId());			
		}
		
	}
}
