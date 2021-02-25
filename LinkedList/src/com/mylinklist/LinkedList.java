package com.mylinklist;

public class LinkedList {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node ref = head;
			while (ref.next != null) {
				ref = ref.next;
			}
			ref.next = node;
		}
	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}

	public void insertAt(int pos, int data) {
		Node node = new Node();
		node.data = data;

		if (pos == 0) {
			insertAtStart(data);
		} else {
			Node ref = head;
			int count = 0;
			while (count != pos - 1) {
				ref = ref.next;
				count++;
			}
			Node nextNode = ref.next;
			ref.next = node;
			node.next = nextNode;
		}

	}

	public void delete(int pos) {
		if (pos == 0) {
			head = head.next;
		} else {
			int count = 0;
			Node ref = head;
			while (count != pos - 1) {
				ref = ref.next;
				count++;
			}
			Node nextNode = ref.next;
			ref.next = nextNode.next;
		}

	}

	public void display() {
		Node ref = head;
		while (ref.next != null) {
			System.out.println(ref.data);
			ref = ref.next;
		}
		System.out.println(ref.data);
	}
}
