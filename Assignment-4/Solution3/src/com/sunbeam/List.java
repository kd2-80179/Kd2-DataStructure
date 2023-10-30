package com.sunbeam;

public class List {
	public class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data=value;
			next=null;
			
		}
		
	
	private Node head;
	public void  List() {
		 head=null;
		 
	}
	public void append(int data) {
		Node newNode=new Node(data);
if(head==null) {
	head=newNode;
	return ;
}
	Node current=head;
	while(current.next!=null) {
		current=current.next;
	}
	current.next=newNode;
	
	}
	public void findMiddle() {
		if(head==null) {
			System.out.println("the linked list is empty");
			return;
		}
		Node slowPtr=head;
		Node fastPtr=head;
		while(fastPtr !=null && fastPtr.next !=null) {
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		System.out.println("Middle node:"+slowPtr.data);
	}

   


}

	public void append(int i) {
		// TODO Auto-generated method stub
		
	}

	public void findMiddle() {
		// TODO Auto-generated method stub
		
	}

}

