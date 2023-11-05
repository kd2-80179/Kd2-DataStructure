package com.sunbeam;

public class List {
	class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class LinkedList {
	    Node head;

	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	    }

	    public void displayReverse(Node node) {
	        if (node == null) {
	            return;
	        }
	        displayReverse(node.next);
	        System.out.print(node.data + " ");
	    }

	    public void displayReverse() {
	        displayReverse(head);
	    }
	}


	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        list.insert(4);
	        list.insert(5);

	        System.out.println("Original linked list:");
	        Node temp = list.head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }

	        System.out.println("\nLinked list in reverse order:");
	        list.displayReverse();
	    }
	}


}
