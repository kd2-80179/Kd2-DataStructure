package com.sunbeam;

public class List {
	public class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data=value;
			next=prev=null;
			
		}
	}
	private Node head;
	public List() {
		head=null;
		
	}
	public boolean isEmpty() {
		return head == null;
		
	}
	public void addFirst(int value) {
		//create node
		Node nn=new Node(value);
		// if list is empty
		if(isEmpty()) {
			//add nn into head
			head=nn;
			//make list circular
			head.next=nn;
			head.prev=nn;
			
		}
		//if list is not empty
		else {
			//a.add first node into next of new node
			nn.next=head;
			//b.add last node into next of prev node
			nn.prev=head.prev;
			//c.add newnode=nn; into next of last node
			head.prev.next=nn;
			//d.add newnode into prv of first node
			head.prev=nn;
			// move head on newnode
			head=nn;
			
		}
	}
     public void addLast(int value) {
    	 //create node
    	 Node nn=new Node(value);
    	 if(isEmpty()) {
    		 // add new node into head
    		 nn=head;
    		 head.next=nn;
    		 head.prev=nn;    		 
    	 }
    	 // if list is not empty
    	 else {
    		 //add first node into next of nn
    		 nn.next=head;
    		 //add last node into prev of nn
    		 nn.prev=head.prev;
    		 // add newnode into next of last
    		 nn=head.prev.next;
    		//add newnode into prev of first
    		 nn=head.prev;
    		 
    	 }
     }
    public void fdisplay() {
    	if(isEmpty())
    		return;
    	// ccreate trav and start at head
    	Node trav=head;
    	System.out.println("forward list");
    	do {
    		System.out.println("" + trav.data);
    		//go on next node
    		trav=trav.next;
    		
    	}while(trav !=head);
    	System.out.println("");
    }
}
    		
    	
    

