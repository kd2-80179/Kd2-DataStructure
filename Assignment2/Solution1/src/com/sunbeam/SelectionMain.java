package com.sunbeam;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionMain {
	public static void selectionSort(int arr[],int N) {
		int count=0;
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j< N;j++) {
				if(arr[i]>arr[j]) {
					count++;
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				
					
				}
			}
		//	int  count=0;
		
		}
		System.out.println("count="+count);
	}
    
	public static void main(String[] args) {
		int arr[]= {6,7,5,8,9,3};
	System.out.println("Arrays before sort:"+Arrays.toString(arr));
	selectionSort(arr,arr.length);
	System.out.println("Arrays after sort:"+Arrays.toString(arr));
	}

}
