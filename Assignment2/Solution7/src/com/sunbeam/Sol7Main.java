package com.sunbeam;

import java.util.Scanner;

public class Sol7Main {

	public static void main(String[] args) {
		LinearQueue q=new LinearQueue(4);
		int choice;
		Scanner sc=new Scanner(System.in);
	  do {
		  System.out.println("0.Exit\n1.push\n2.pop\n3.peek");
	      System.out.println("enter your choice");
	      choice=sc.nextInt();
	      switch(choice) {
	      case 1:
	    	  if(q.isFull())
	    	  
	    	System.out.println("queue is full");	
	    	else {
	    		System.out.println("enter data");
	    		int data=sc.nextInt();
	    		q.push(data);
	    	}
	    	break;
	    	case 2:
	    	if(q.isEmpty())	
	    		System.out.println("queue is empty");
	    	else
	    		System.out.println("peeked data:"+q.peek());
	      break;
	      }
	  }while(choice !=0);
	//  sc.close();
	
	}
	  }



