package com.sunbeam;

import java.util.Scanner;

public class Main5Sol {


	static int firstNonRepeating(int arr[],int n) {
		for(int i=0;i<n;i++) {
			int j;
			for(j=0;j<n;j++) 
				if (i!=j && arr[i]==arr[j])
					break;
			
			if(j==n)
				return arr[i];
		}
			return -1;
			}
	
		public static void main(String[] args) {
			int arr[]= {1,2,3,-2,1,0,4,-1,7,8};
			int n=arr.length;
			System.out.println(firstNonRepeating (arr,n));
		}

}	
}for(int i=0;i<n;i++) {
		for(j=0;j<n;j++)
			if(i!=j && arr[i] ==arr[j])
				break;
		if(j==n)  
			return arr[i]
	}
	