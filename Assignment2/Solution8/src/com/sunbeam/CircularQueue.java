package com.sunbeam;

public class CircularQueue {
	
	private int arr[];
	private int rear,front;
	private final int SIZE;
	public  int count;
	public CircularQueue(int size) {
		SIZE=size;
		arr=new int[SIZE];
		front=-1;
		rear=-1;
		
	}
	public void push(int data) {
		rear=(rear+1)%SIZE;
		arr[rear]=data;
		count++;
		
	}
	public void pop() {
		front=(front+1)%SIZE;
		if(front==rear)
	   front =rear=-1;
		count--;
	}
	public int peek() {
		return arr[(front+1)%SIZE];
	}
	public boolean isFull() {
		return(front==rear && rear!=-1)||(front==-1 && rear==SIZE -1);
		
	}
public boolean isEmpty() {
	return front == rear && rear==-1;
}

	

}
