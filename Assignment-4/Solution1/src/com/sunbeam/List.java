package com.sunbeam;

public class List {
	public class Node{
		private int data;
		private Node next;

		private Node(int value) {
			data=value;
			next=null;
			
		}
	}
private Node head;
private Node tail;
public List() {
	head=null;
	tail=null;
}
public boolean isEmpty() {
	return head==null;
}
public void addFirst(int value) {
	//1.create node with given value
	Node newnode=new Node(value);
//if list is empty
	if(isEmpty()) {
		//add  new node into head itself
		head=newnode;
	    tail=newnode;}
	//if list is not empty
	else {
		// add first node into next of newnode
		newnode.next=head;
		//add newnode into head
		head=newnode;
	}
}
public void addLast(int value) {
	//  create node with given data
	Node newnode=new Node(value);
	if(isEmpty())// add newnode into head itself
		{
		head=newnode;
		tail=newnode;}
		//if list is not empty
		else {

			tail.next=newnode;
			tail=newnode;
		}
	}
public void deleteLast() {
	if(isEmpty()) 
		System.out.println("list is empty");
		//if list has single node
		else if(head.next==null)
			//make head equal to null
			head=null;
	//if list has multiple nodes
		else {
			// traverse till second last node
			Node trav =head;
			while(trav.next.next !=null)
				trav=trav.next;
// make next of second last node equal to null
			trav.next=null;
		
	}
}
public void displayList() {
	//1. create one referance and start at first node
	Node trav = head;
	System.out.print("List :");
	while(trav != null) {
		//2. print(visit) the current node
		System.out.print("  " + trav.data);
		//3. go on next node
		trav = trav.next;
	}//4. repeat step 2 and 3 till last node
	System.out.println("");
}
}
 

