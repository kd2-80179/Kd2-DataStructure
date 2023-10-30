package com.sunbeam;

public class ListMain {

	public static void main(String[] args) {
		List l1= new List();
		l1.addFirst(10);
		l1.addFirst(20);
		//l1.displayList();
		l1.addLast(30);
		l1.addLast(45);
		l1.deleteLast();
		
		l1.displayList();
	}

}
