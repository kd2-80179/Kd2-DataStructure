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

	    // Function to insert elements into the linked list
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

	    // Function to find the maximum value in the linked list
	    public int findMaximum() {
	        if (head == null) {
	            throw new IllegalStateException("Linked list is empty");
	        }

	        int max = head.data;
	        Node temp = head.next;
	        while (temp != null) {
	            if (temp.data > max) {
	                max = temp.data;
	            }
	            temp = temp.next;
	        }
	        return max;
	    }

	    // Function to find the minimum value in the linked list
	    public int findMinimum() {
	        if (head == null) {
	            throw new IllegalStateException("Linked list is empty");
	        }

	        int min = head.data;
	        Node temp = head.next;
	        while (temp != null) {
	            if (temp.data < min) {
	                min = temp.data;
	            }
	            temp = temp.next;
	        }
	        return min;
	    }
	}


	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        list.insert(3);
	        list.insert(1);
	        list.insert(5);
	        list.insert(2);
	        list.insert(4);

	        // Find and print the maximum value in the linked list
	        int maximum = list.findMaximum();
	        System.out.println("Maximum value in the linked list: " + maximum);

	        // Find and print the minimum value in the linked list
	        int minimum = list.findMinimum();
	        System.out.println("Minimum value in the linked list: " + minimum);
	    }
	}




