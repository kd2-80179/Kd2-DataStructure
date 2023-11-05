package com.sunbeam;


	import java.util.Stack;

	class QueueUsingStacks {
	    Stack<Integer> stack1 = new Stack<>();
	    Stack<Integer> stack2 = new Stack<>();

	    // Enqueue an item to the queue
	    public void enqueue(int x) {
	        stack1.push(x);
	    }

	    // Dequeue an item from the queue
	    public int dequeue() {
	        if (stack2.isEmpty()) {
	            if (stack1.isEmpty()) {
	                throw new IllegalStateException("Queue is empty");
	            }
	            while (!stack1.isEmpty()) {
	                stack2.push(stack1.pop());
	            }
	        }
	        return stack2.pop();
	    }

	    // Returns the front element of the queue without removing it
	    public int peek() {
	        if (stack2.isEmpty()) {
	            if (stack1.isEmpty()) {
	                throw new IllegalStateException("Queue is empty");
	            }
	            while (!stack1.isEmpty()) {
	                stack2.push(stack1.pop());
	            }
	        }
	        return stack2.peek();
	    }

	    // Returns whether the queue is empty
	    public boolean isEmpty() {
	        return stack1.isEmpty() && stack2.isEmpty();
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        QueueUsingStacks queue = new QueueUsingStacks();
	        queue.enqueue(1);
	        queue.enqueue(2);
	        queue.enqueue(3);

	        System.out.println("Front element: " + queue.peek()); // Output: 1
	        queue.dequeue();
	        System.out.println("Front element after dequeue: " + queue.peek()); // Output: 2
	        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: false
	        queue.dequeue();
	        queue.dequeue();
	        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: true
	    }
	}



