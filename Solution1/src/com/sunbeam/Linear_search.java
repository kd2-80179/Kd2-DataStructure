

package com.sunbeam;

import java.util.Scanner;

public class Linear_search {
	private static int count;
	public static int linear_search(int arr[],int n,int key) {
		
		 for(int i=0;i<n;i++) { 
			 count++;  
		 
    	 if (arr[i]==key) 
    		 
             return count;
		 }
		return key;
	}
	public static void main(String[] args) {
		int arr[] = {66,11,33,88,22,99,77,33};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter key to be searched");
		int key=sc.nextInt();
		int index=linear_search(arr,arr.length,key);
		if(index !=-1)
			System.out.println("key is found at index");
		else
			System.out.println("key is not fount");
		System.out.println("enter count="+count);
		sc.close();
		
	}

}
	