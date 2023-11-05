package com.sunbeam;




class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public LinkedList() {
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

    public void insertAfterNode(int key, int newData) {
        Node newNode = new Node(newData);
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Node with key " + key + " not found in the list.");
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void insertBeforeNode(int key, int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.data == key) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Node with key " + key + " not found in the list.");
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(3);
        list.addNode(4);

        System.out.println("Original linked list:");
        list.display();

        // Insert after node with key 1
        list.insertAfterNode(1, 2);
        System.out.println("Linked list after inserting 2 after 1:");
        list.display();

        // Insert before node with key 3
        list.insertBeforeNode(3, 5);
        System.out.println("Linked list after inserting 5 before 3:");
        list.display();
    }

}



