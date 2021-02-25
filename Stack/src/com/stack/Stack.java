package com.stack;

public class Stack {

	int stack[];
	int top = 0;

	Stack(int size) {
		this.stack = new int[size];
	}

	void push(int data) {
		stack[top] = data;
		top++;
	}

	int pop() {
		int ele;
		top--;
		ele = stack[top];
		stack[top] = 0;
		return ele;
	}

	int peek() {
		int ele;
		ele = stack[top-1];
		return ele;
	}

	void display() {
		for (int data : stack) {
			System.out.println(data + "");
		}

	}

}
