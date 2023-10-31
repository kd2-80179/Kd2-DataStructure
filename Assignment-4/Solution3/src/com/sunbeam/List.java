package com.sunbeam;

public class List {
	public class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data=value;
			next=null;
			
		}
		
	}
	private Node head;
	public void  PrintMiddle() {
		 Node slow_ptr=head;
		 Node fast_ptr=head;
		while(fast_ptr!=null && fast_ptr.next!=null ) {
			fast_ptr=fast_ptr.next.next;
		    slow_ptr=slow_ptr.next;
	}
		Object slow_Ptr;
		System.out.println("the middle element is:"+slow_Ptr.data);
	}
	
	public void add( int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	public void displayList() {
		
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

