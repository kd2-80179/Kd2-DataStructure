package com.sunbeam;

public class List {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;

		}
	}

	private Node tail;

	public List() {
		tail = null;

	}

	public boolean isEmpty() {
		return tail == null;

	}

	public void addFirst(int value) {
		// create node with given value
		Node newnode = new Node(value);
		// if list is empty
		if (isEmpty()) {
			tail = newnode;
			newnode.next = newnode;
		}
		// if list is not empty
		else {
			// add first node into next of newnode
			newnode.next = tail.next;
			tail.next = newnode;
			//

		}
	}

	public void addLast(int value) {
		// create node with given data
		Node newnode = new Node(value);

		if(isEmpty()) {
			tail = newnode;
			newnode.next = newnode;
		} else {
			Node trav = tail;
			newnode.next = tail.next;
		    tail.next=newnode;
		    tail=newnode;
		}
		

		// if list is empty
//		if(isEmpty()) {
//			// add newnode into tail
//			newnode.next=newnode;
//			// traverse till last node
//			Node trav=tail;
//			while(trav.next !=tail)
//				trav=trav.next;
//			trav.next=newnode;
//		}
	}
	public void deleteLast() {
		//if list is empty
		Node trav=tail;
		while(trav.next!=tail) {
			trav=trav.next;
			
		}
		trav.next=tail.next;
		tail=trav;
	}

	public void addPosition(int value
			, int pos) {
		Node newnode = new Node(value);
		for(int i=1;i<pos-1;i++) {
		
	     trav=trav.next;
			}
		Newnode next=
	}

	public void displayList() {
		if (isEmpty())
			return;
		// 1.create trav and start at head
		System.out.println("list:");
		Node trav = tail;
		do {
			// 2.visit(print) current ode
			System.out.println(" " + trav.data);
			// 3.go on next node
			trav = trav.next;
		} while (trav != tail);
		System.out.println(" ");

	}

}
