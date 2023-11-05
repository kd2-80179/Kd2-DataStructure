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

	    public void insertSorted(int data) {
	        Node newNode = new Node(data);
	        if (head == null || head.data >= data) {
	            newNode.next = head;
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null && temp.next.data < data) {
	                temp = temp.next;
	            }
	            newNode.next = temp.next;
	            temp.next = newNode;
	        }
	    }

	    public void display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	}

	
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        list.insertSorted(3);
	        list.insertSorted(1);
	        list.insertSorted(5);
	        list.insertSorted(2);
	        list.insertSorted(4);

	        System.out.println("Linked list in sorted order:");
	        list.display();
	    }
	}



