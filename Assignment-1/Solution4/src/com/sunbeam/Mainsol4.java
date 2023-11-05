package com.sunbeam;

import java.util.Scanner;

public class Mainsol4 {
  
	public static void main(String[] args) {
		int arr[]= {1,2,3,-1,2,1};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number  to be searched");
		int num=sc.nextInt();
		System.out.println("enter n occurance to be searched");
		 int n=sc.nextInt();
		int length;
		int count = 0;
		for(int j=0;j<arr.length;j++) {
			if(num==arr[j]) {
				count++;
				if(count==n) {
					System.out.println("index is ="+j);
				}
			
					
		}
		}
		
			System.out.println("occurance="+n);
		
				
			
		
		}
	


}

