package com.sunbeam;

public class Deque {
	List l1;
	Deque(){
		l1=new List();	
	}
	boolean isEmpty()
	{
		return l1.isEmpty();
	}
	void rear(int val) {
		//l1.deleteFirst();
		l1.addLast(val);
	}
	void front(int val) {
		l1.addFirst(val);
	}
	int peek() {
		return l1.getData();
		
	}

	public static void main(String[] args) {
		Deque q=new Deque();
		q.rear(34);
		q.rear(44);
		q.front(34);
		q.front(56);
		q.rear(57);
System.out.println(q.peek());
	}

}




