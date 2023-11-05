package com.sunbeam;

	import java.util.LinkedList;
	import java.util.Queue;

	class StackUsingQueues {
	    Queue<Integer> queue1 = new LinkedList<>();
	    Queue<Integer> queue2 = new LinkedList<>();

	    // Push element onto the stack
	    public void push(int x) {
	        queue2.add(x);
	        while (!queue1.isEmpty()) {
	            queue2.add(queue1.poll());
	        }
	        Queue<Integer> temp = queue1;
	        queue1 = queue2;
	        queue2 = temp;
	    }

	    // Removes the element on top of the stack
	    public void pop() {
	        if (!isEmpty()) {
	            queue1.poll();
	        }
	    }

	    // Returns the element on top of the stack
	    public int top() {
	        if (!isEmpty()) {
	            return queue1.peek();
	        }
	        throw new IllegalStateException("Stack is empty");
	    }

	    // Returns whether the stack is empty
	    public boolean isEmpty() {
	        return queue1.isEmpty();
	    }
	

	    public static void main(String[] args) {
	        StackUsingQueues stack = new StackUsingQueues();
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);

	        System.out.println("Top element: " + stack.top()); // Output: 3
	        stack.pop();
	        System.out.println("Top element after pop: " + stack.top()); // Output: 2
	        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
	        stack.pop();
	        stack.pop();
	        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: true
	    }
	}


