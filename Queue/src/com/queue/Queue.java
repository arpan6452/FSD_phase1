package com.queue;

public class Queue {

	int queue[];
	int font = 0;
	int rare = 0;

	Queue(int size) {
		this.queue = new int[size];
	}

	void add(int data) {
		queue[rare] = data;
		rare++;
	}

	int remove() {
		int ele;		
		ele = queue[font];
		queue[font] = 0;
		return ele;
	}

	int peek() {
		int ele;
		ele = queue[font];
		return ele;
	}

	void display() {
		for (int data : queue) {
			System.out.println(data + "");
		}

	}

}
