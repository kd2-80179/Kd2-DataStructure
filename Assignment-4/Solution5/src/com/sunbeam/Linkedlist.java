package com.sunbeam;



class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linkedlist {
    Node head;

    public Linkedlist() {
        this.head = null;
    }

    public void addNode(int data) {
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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);

        System.out.println("Original linked list:");
        list.display();

        list.reverse();

        System.out.println("Reversed linked list:");
        list.display();
    }
}

