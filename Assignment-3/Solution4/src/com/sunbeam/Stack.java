package com.sunbeam;
public class Stack {
	private char arr[];
	private int top;
	private final int SIZE;

	public Stack(int size) {
		SIZE = size;
		arr = new char[SIZE];
		top = -1;

	}

	public void push(double d) {
		if (top == this.SIZE - 1) {
			System.out.println("full");
		} else {
			top++;
			arr[top] = (char) d;
		}

	}

	public int pop() {
		if (top == -1)

		{
			return 1;
		}

		int data = arr[top];
		top--;
		return data;
	}

	public int peek() {
		return arr[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}





}


