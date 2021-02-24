package com.producer_consumer_multithreading;

public class Producer extends Thread {
	private Resource resource;

	public Producer(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			resource.put(i);
			System.out.println("Producer put: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
