package com.sunbeam;

public class Queue {
	List l1;
	Queue(){
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
		Queue q=new Queue();
		q.rear(34);
		q.rear(44);
		q.front(34);
System.out.println(q.peek());
	}

}
