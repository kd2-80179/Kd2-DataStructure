package com.sunbeam;

public class MainCircular {

	public static void main(String[] args) {
		List l1=new List();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		
		l1.addLast(40);
	//	l1.displayList();
		l1.addLast(90);
		
		l1.addLast(80);
		l1.deleteLast();
		l1.addPosition(4, 1);
		l1.addPosition(2, 5);
		l1.displayList();
		l1.addPosition(2, 20);
	}

}
