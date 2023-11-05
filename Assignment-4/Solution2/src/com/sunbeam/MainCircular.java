package com.sunbeam;

public class MainCircular {

	public static void main(String[] args) {
		List l1 = new List();
		
		//l1.deleteFirst();
		l1.addLast('s');
		//l1.deleteFirst();
		l1.addLast('u');
		l1.addLast('n');
		l1.addFirst('m');
		l1.addFirst('a');
		l1.addFirst('e');
		l1.addFirst('b');
		l1.addPosition('@', 1);
		//l1.deleteFirst();
		// s -> u -> n -> b -> e -> a -> m
		//l1.deleteLast();
		l1.displayList();
		l1.deletePosition(8);
		l1.displayList();
		System.out.println("Node count : " + l1.getCount());
		
		l1.deleteAll();
	}

}
