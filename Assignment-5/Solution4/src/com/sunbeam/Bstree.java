package com.sunbeam;

public class Bstree {
public class Node{
	private int data;
	private Node left;
	private Node right;
	public Node(int value) {
		data=value;
		left=null;
		right=null;
		
	}
}
private Node root;
public Bstree() {
	root=null;	
}
public boolean isEmpty() {
	return root == null;
	
}
public void addNode(int value) {
	//create node with given data;
	Node newnode=new Node(value);
	if(isEmpty()) 
		//add new node into root itself
		root=newnode;
	//if tree is not empty	
		else {
		// create trav and start at root
			Node trav=root;
			while(true) {
//if value is less than current node data
	if(value<trav.data)	{
// if current node left is empty	
	if(trav.left==null)	{
		//add value in current data
		trav.left=newnode;
		break;
	}
	// if current node left is not empty
	else
		//go into left
		trav=trav.left;
	
	}
// if value is greater than current node data
	else {
		// if current node right is empty
		if(trav.right==null) {
			trav.right=newnode;
			break;
		}
		//if current node right is not empty
		else
			trav=trav.right;
	}
			
		}
	}
	
}
void preOrder(Node trav) {
	if(trav == null)
		return;
	// visit current node(print data)
	System.out.println(""+ trav.data);
	//go into left of current node
	preOrder(trav.left);
	preOrder(trav.right);
	
}
void preOrder() {
	System.out.println("preorder :");
	preOrder(root);
	System.out.println("");
}

	

}
