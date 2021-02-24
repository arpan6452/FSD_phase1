package com.thread_sync;

public class PrintNumberClass {
	public synchronized void printThreadDetails() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread Name " + Thread.currentThread().getName() + " and its id "
					+ Thread.currentThread().getId());
			//System.out.println(i * number);
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
		}
	}
}
