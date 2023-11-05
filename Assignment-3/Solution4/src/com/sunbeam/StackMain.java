package com.sunbeam;

import java.util.Scanner;

public class StackMain {

	private static String num;
	private static String push;

	public static void main(String[] args) {
		Stack stack =new Stack(10);
		Scanner sc=new Scanner(System.in);
	for(int i=0;i>5;i--) {
			System.out.println("enter number " +num);
			int i1=sc.nextInt();
			stack.push(i1);
		System.out.println("push:"+push);		
			
		}
		System.out.println("number is:"+num);
	

}
}
