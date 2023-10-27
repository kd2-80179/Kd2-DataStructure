package com.sunbeam;

import java.util.Arrays;

public class InsertionMain {
  public static void insertionSort(int arr[],int N) {
	 // count no of passes
	  for(int i=1;i<N;i++) {
		  // take backup of one element
		  int temp= arr[i];
		  // find immediate left neighbour
		  int j=i-1;
		  int count=0;
//compared backed element  ith all its left neighbour
		  while(j>=0 && arr[j] > temp) {
		if(	arr[j+1]==arr[j]); 
			j--;
			
		  }
		 arr[j+1] =temp;
	  }
	  int count=0;
	 count++;
	System.out.println("count:"+count);
  }
	public static void main(String[] args) {
		int arr[]= {55,44,22,66,11,33};
		System.out.println("Arrays before sort:"+Arrays.toString(arr));
	     insertionSort(arr,arr.length);
	     System.out.println("arrays after sort:"+ Arrays.toString(arr));
	}

}
