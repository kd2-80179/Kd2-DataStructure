package com.sunbeam;

public class Stack {
	private int arr[];
	private int top;
	private final int SIZE;
	public Stack(int size) {
		SIZE=size;
		arr=new int[5];
		top=-1;
		
	}
	public void push(int data) {
		top++;
		arr[top]=data;
		
	}
	public int pop() {
		int data=arr[top];
		top--;
		return data;
		
	}
	public int peek() {
		return arr[top];
		
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==SIZE-1;
	}

}
