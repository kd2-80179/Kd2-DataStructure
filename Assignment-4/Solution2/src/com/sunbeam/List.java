package com.sunbeam;

public class List {
	public class Node{
		private char data;
		private Node next;
		public Node(char value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	private int count;
	public List() {
		head = null;
		count = 0;
	}
	
	public int getCount() {
		return count;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addFirst(char value) {
		//1. create node with given data
		Node newnode = new Node(value);
		//2. if list is empty
		if(isEmpty()) {
			//a. add newnode into head
			head = newnode;
			//b. make list circular
			newnode.next = newnode;
		}
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			newnode.next = head;
			//b. traverse till last node
			Node trav = head;
			while(trav.next != head)
				trav = trav.next;
			//c. add newnode into next of last node
			trav.next = newnode;
			//d. move head on newnode
			head = newnode;
		}
		// increament count
		count++;	
	}
	
	public void addLast(char value) {
		//1. create node with given data
		Node newnode = new Node(value);
		//2. if list is empty
		if(isEmpty()) {
			//a. add newnode into head
			head = newnode;
			//b. make list circular
			head.next = head;
		}
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			newnode.next = head;
			//b. traverse till last node
			Node trav = head;
			while(trav.next != head)
				trav = trav.next;
			//c. add newnode into next of last node
			trav.next = newnode;
		}
		// increament count
		count++;
	}
	
	public void addPosition(char value, int pos) {
		// validate position : 
		// valid positions 1 >= pos <= count+1
		if(pos < 1 || pos > count+1)
			return;
		//1. create node
		Node newnode = new Node(value);
		//2. if list is empty
		if(isEmpty()) {
			//a. add newnode into head
			head = newnode;
			//b. make it circular
			head.next = head;
		}
		else if (pos == 1) {
			addFirst(value);
			return;
		}
		//3. if list is not empty
		else {
			//a. traverse till pos-1
			Node trav = head;
			for(int i = 1 ; i < pos - 1 ; i++)
				trav = trav.next;
			//b. add pos node into next of newnode
			newnode.next = trav.next;
			//c. add newnode into next of pos-1 node
			trav.next = newnode;
		}
		//increament count
		count++;
	}
	
	public void deleteFirst() {
		//1. if list is empty
		if(isEmpty()) {
			// print msg
			System.out.println("List is empty");
			return;
		}
		//2. if list has single node
		else if(head.next == head)
			// make head = null
			head = null;
		//3. if list has multiple nodes
		else {
			//a. traverse till last node
			Node trav = head;
			while(trav.next != head)
				trav = trav.next;
			//b. add second node into next of last node
			trav.next = head.next;
			//c. move head on second node
			head = head.next;
		}
		// decreament count
		count--;
	}
	
	public void deleteLast() {
		//1. if list is empty
		if(isEmpty()) {
			// print msg and return
			System.out.println("List is empty");
			return;
		}
		//2. if list has single node
		else if(head.next == head)
			//a. make head = null
			head = null;
		//3. if list has multiple nodes
		else {
			//a. traverse till second last node
			Node trav = head;
			for( ; trav.next.next != head ; trav = trav.next);
			
			//b. add first node into next of second last node
			trav.next = head;
		}
		// decreament count
		count--;
	}
	
	public void deletePosition(int pos) {
		// validate position
		// valid positions : 1 >= pos <= count 
		if(pos < 1 || pos > count)
			return;
		//1. if list is empty
		if(isEmpty()) {
			// print msg and return
			System.out.println("List is empty");
			return;
		}
		else if(pos == 1) {
			deleteFirst();
			return;
		}
		//2. if list has single node
		else if(head.next == head)
			// make head = null
			head = null;
		//3. if last has multiple node
		else {
			//a. traverse till pos - 1 node
			Node trav = head;
			for(int i = 1  ; i < pos - 1 ; i++)
				trav = trav.next;
			//b. add pos+1 node into next of pos-1 node
			trav.next = trav.next.next;
		}
		// decreament count
		count--;
	}
	
	public void displayList() {
		if(isEmpty())
			return;
		//1. create trav and start at head
		System.out.print("List : ");
		Node trav = head;
		do {
			//2. visit(print) current node
			System.out.print("  " + trav.data);
			//3. go on next node
			trav = trav.next;
		}while(trav != head);//4. repeat step 2 and 3 till last node
		System.out.println("");
	}
	
	public void deleteAll() {
		head = null;
	}
}



