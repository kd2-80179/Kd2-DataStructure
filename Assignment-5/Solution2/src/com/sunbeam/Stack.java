
package com.sunbeam;

public class Stack {
	List l1;
	
	//List list =new List();
	Stack(){
		l1=new List();
	}
	boolean isEmpty() {
		return l1.isEmpty();
	}
	void push(int val){
		
		l1.addFirst(val);
		
	}
	void pop()
	{
		l1.deleteFirst();
		
	}
	int peek() {
		return l1.getData();
		
	}

	public static void main(String[] args) {
	Stack s=new Stack();
	
	s.push(40);
	s.push(43);	
	s.push(90);
	s.push(45);
     s.pop();
   System.out.println(s.peek());
	}

}
